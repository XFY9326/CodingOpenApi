package lib.xfy9326.coding.openapi.services.api;

import lib.xfy9326.coding.openapi.services.Api;
import lib.xfy9326.coding.openapi.services.ApiResponseListener;
import lib.xfy9326.coding.openapi.services.beans.CurrentUser;

import java.util.Map;

public class Account {
    // GET /account/avatar
    public static Api<String> getAvatar(final String token, final ApiResponseListener<String> listener) {
        return new Api<String>() {
            @Override
            public String getUrl() {
                return "/account/avatar";
            }

            @Override
            public String getAuthorizationToken() {
                return token;
            }

            @Override
            public Map<String, String> getQueryParam() {
                return null;
            }

            @Override
            public ApiResponseListener<String> getResponseListener() {
                return listener;
            }
        };
    }

    // GET /account/email
    public static Api<String> getEmail(final String token, final ApiResponseListener<String> listener) {
        return new Api<String>() {
            @Override
            public String getUrl() {
                return "/account/email";
            }

            @Override
            public String getAuthorizationToken() {
                return token;
            }

            @Override
            public Map<String, String> getQueryParam() {
                return null;
            }

            @Override
            public ApiResponseListener<String> getResponseListener() {
                return listener;
            }
        };
    }

    // GET /account/current_user
    public static Api<CurrentUser> getCurrentUser(final String token, final ApiResponseListener<CurrentUser> listener) {
        return new Api<CurrentUser>() {
            @Override
            public String getUrl() {
                return "/account/current_user";
            }

            @Override
            public String getAuthorizationToken() {
                return token;
            }

            @Override
            public Map<String, String> getQueryParam() {
                return null;
            }

            @Override
            public ApiResponseListener<CurrentUser> getResponseListener() {
                return listener;
            }
        };
    }
}
