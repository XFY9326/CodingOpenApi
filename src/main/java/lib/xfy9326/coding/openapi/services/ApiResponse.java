package lib.xfy9326.coding.openapi.services;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class ApiResponse<T> {
    private HttpStatus mHttpStatus;
    private int mCode;
    private String mErrorMsg = null;
    private T mData = null;

    public ApiResponse(int httpStatus) throws ApiResponseException {
        switch (httpStatus) {
            case 200:
                this.mHttpStatus = HttpStatus.HTTP_200;
                break;
            case 404:
                this.mHttpStatus = HttpStatus.HTTP_404;
                break;
            case 500:
                this.mHttpStatus = HttpStatus.HTTP_500;
                break;
            default:
                throw new ApiResponseException("Unsupported http status: " + httpStatus);
        }
    }

    public ApiResponse(HttpStatus httpStatus) {
        this.mHttpStatus = httpStatus;
    }

    public void buildContent(String content, ErrorMsgParser msgParser) throws ApiResponseException {
        if (this.mHttpStatus == HttpStatus.HTTP_200) {
            try {
                JsonObject jsonObject = (JsonObject) JsonParser.parseString(content);
                this.mCode = jsonObject.get("code").getAsInt();
                if (this.mCode == 0) {
                    Type type = new TypeToken<T>() {
                    }.getType();
                    this.mData = new Gson().fromJson(jsonObject.get("data"), type);
                } else {
                    if (msgParser == null) {
                        this.mErrorMsg = jsonObject.get("msg").toString();
                    } else {
                        this.mErrorMsg = msgParser.parseErrorMsg(jsonObject.get("msg"));
                    }
                }
            } catch (JsonSyntaxException e) {
                throw new ApiResponseException("Json parse error! " + e.getMessage());
            }
        } else {
            throw new ApiResponseException("Json content can't be built due to http status: " + this.mHttpStatus.mCode);
        }
    }

    public boolean isSuccess() {
        return this.mHttpStatus == HttpStatus.HTTP_200 && this.mCode == 0;
    }

    public int getCode() {
        return this.mCode;
    }

    public String getErrorMsg() {
        return mErrorMsg;
    }

    public void setErrorMsg(String msg) {
        this.mErrorMsg = msg;
    }

    public HttpStatus getHttpStatus() {
        return this.mHttpStatus;
    }

    public T getData() {
        return this.mData;
    }

    public void setData(T data) {
        this.mData = data;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "mHttpStatus=" + mHttpStatus +
                ", mCode=" + mCode +
                ", mErrorMsg='" + mErrorMsg + '\'' +
                ", mData=" + mData +
                '}';
    }

    public enum HttpStatus {
        HTTP_200(200),
        HTTP_404(404),
        HTTP_500(500);

        private int mCode;

        HttpStatus(int code) {
            this.mCode = code;
        }

        public int getCode() {
            return this.mCode;
        }
    }

    public interface ErrorMsgParser {
        String parseErrorMsg(JsonElement json);
    }
}
