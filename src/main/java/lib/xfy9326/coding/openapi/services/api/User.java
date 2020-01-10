package lib.xfy9326.coding.openapi.services.api;

import lib.xfy9326.coding.openapi.services.Api;
import lib.xfy9326.coding.openapi.services.ApiResponseListener;
import lib.xfy9326.coding.openapi.services.beans.PersonalPublicKey;

import java.util.List;
import java.util.Map;

public class User {

    // GET /user/{username}/keys
    public static Api<List<PersonalPublicKey>> listPersonalPublicKey(final String token, final String userName, final ApiResponseListener<List<PersonalPublicKey>> listener) {
        return new Api<List<PersonalPublicKey>>() {
            @Override
            public String getUrl() {
                return String.format("/user/%s/keys", userName);
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
            public ApiResponseListener<List<PersonalPublicKey>> getResponseListener() {
                return listener;
            }
        };
    }
}
