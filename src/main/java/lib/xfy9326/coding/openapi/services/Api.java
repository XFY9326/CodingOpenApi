package lib.xfy9326.coding.openapi.services;

import java.util.Map;

public abstract class Api<T> {
    public abstract String getUrl();

    public abstract String getAuthorizationToken();

    public abstract Map<String, String> getQueryParam();

    public abstract ApiResponseListener<T> getResponseListener();
}