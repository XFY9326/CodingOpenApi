package lib.xfy9326.coding.openapi.services.api;

import lib.xfy9326.coding.openapi.services.Api;
import lib.xfy9326.coding.openapi.services.ApiResponseListener;
import lib.xfy9326.coding.openapi.services.beans.ProjectInfo;
import lib.xfy9326.coding.openapi.services.beans.UserOpenProjectList;
import lib.xfy9326.coding.openapi.services.beans.UserProjectList;

import java.util.HashMap;
import java.util.Map;

public class Projects {

    // GET /user/projects?type=all&amp;page={page}&amp;pageSize={pageSize}
    public static Api<UserProjectList> getUserProjectList(final String token, final int page, final int pageSize, final ApiResponseListener<UserProjectList> listener) {
        return new Api<UserProjectList>() {
            @Override
            public String getUrl() {
                return "/user/projects";
            }

            @Override
            public String getAuthorizationToken() {
                return token;
            }

            @Override
            public Map<String, String> getQueryParam() {
                HashMap<String, String> map = new HashMap<>();
                map.put("type", "all");
                map.put("page", String.valueOf(page));
                map.put("pageSize", String.valueOf(pageSize));
                return map;
            }

            @Override
            public ApiResponseListener<UserProjectList> getResponseListener() {
                return listener;
            }
        };
    }

    // GET /user/{username}/projects/public?type=joined&amp;page={page}&amp;pageSize={pageSize}
    public static Api<UserOpenProjectList> getUserOpenProjectList(final String userName, final int page, final int pageSize, final ApiResponseListener<UserOpenProjectList> listener) {
        return new Api<UserOpenProjectList>() {
            @Override
            public String getUrl() {
                return String.format("/user/%s/projects/public", userName);
            }

            @Override
            public String getAuthorizationToken() {
                return null;
            }

            @Override
            public Map<String, String> getQueryParam() {
                HashMap<String, String> map = new HashMap<>();
                map.put("type", "joined");
                map.put("page", String.valueOf(page));
                map.put("pageSize", String.valueOf(pageSize));
                return map;
            }

            @Override
            public ApiResponseListener<UserOpenProjectList> getResponseListener() {
                return listener;
            }
        };
    }

    // GET /user/{username}/project/{project_name}
    public static Api<ProjectInfo> getProjectInfo(final String token, final String userName, final String projectName, final ApiResponseListener<ProjectInfo> listener) {
        return new Api<ProjectInfo>() {
            @Override
            public String getUrl() {
                return String.format("/user/%s/project/%s", userName, projectName);
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
            public ApiResponseListener<ProjectInfo> getResponseListener() {
                return listener;
            }
        };
    }

    // GET /user/{username}/project/{project_name}
    public static Api<ProjectInfo> getProjectInfo(String userName, String projectName, ApiResponseListener<ProjectInfo> listener) {
        return getProjectInfo(null, userName, projectName, listener);
    }
}
