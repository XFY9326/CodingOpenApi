package lib.xfy9326.coding.openapi.services;

public interface ApiResponseListener<T> {
    void onResponse(ApiResponse<T> response);

    void onError(ApiResponseException e);
}
