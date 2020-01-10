package lib.xfy9326.coding.openapi;

import lib.xfy9326.coding.openapi.services.Api;
import lib.xfy9326.coding.openapi.services.ApiResponse;
import lib.xfy9326.coding.openapi.services.ApiResponseException;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

public class OpenApi {
    public static final String BASE_URL = "https://coding.net/api/";
    private static OpenApi mInstance;

    private OkHttpClient mClient;

    private OpenApi() {
        mClient = new OkHttpClient.Builder().build();
    }

    public static OpenApi getInstance() {
        synchronized (OpenApi.class) {
            if (mInstance == null) {
                mInstance = new OpenApi();
            }
        }
        return mInstance;
    }

    public <T> void request(Api<T> api) {
        Request.Builder requestBuilder = new Request.Builder();
        HttpUrl.Builder urlBuilder = HttpUrl.get(OpenApi.BASE_URL + api.getUrl()).newBuilder();
        if (api.getQueryParam() != null) {
            for (Map.Entry<String, String> entry : api.getQueryParam().entrySet()) {
                urlBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        requestBuilder.url(urlBuilder.build());
        if (api.getAuthorizationToken() != null) {
            requestBuilder.addHeader("Authorization", "token " + api.getAuthorizationToken());
        }
        mClient.newCall(requestBuilder.build()).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                if (e instanceof ApiResponseException) {
                    api.getResponseListener().onError((ApiResponseException) e);
                } else {
                    api.getResponseListener().onError(new ApiResponseException(e.getCause()));
                }
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                ApiResponse<T> apiResponse = new ApiResponse<>(response.code());
                apiResponse.buildContent(Objects.requireNonNull(response.body()).string(), null);
                response.close();
                api.getResponseListener().onResponse(apiResponse);
            }
        });

    }
}
