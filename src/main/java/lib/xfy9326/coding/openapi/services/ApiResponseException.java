package lib.xfy9326.coding.openapi.services;

import java.io.IOException;

public class ApiResponseException extends IOException {
    public ApiResponseException(String msg) {
        super("ApiResponseException: " + msg);
    }

    public ApiResponseException(Throwable throwable) {
        super(throwable);
    }
}
