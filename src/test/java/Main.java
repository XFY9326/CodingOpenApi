import lib.xfy9326.coding.openapi.OpenApi;
import lib.xfy9326.coding.openapi.services.ApiResponse;
import lib.xfy9326.coding.openapi.services.ApiResponseException;
import lib.xfy9326.coding.openapi.services.ApiResponseListener;
import lib.xfy9326.coding.openapi.services.api.Projects;
import lib.xfy9326.coding.openapi.services.beans.ProjectInfo;

public class Main {

    public static void main(String[] args) {
        String token = "";

        OpenApi.getInstance().request(Projects.getProjectInfo("", "", new ApiResponseListener<ProjectInfo>() {
            @Override
            public void onResponse(ApiResponse<ProjectInfo> response) {
                System.out.println(response);
            }

            @Override
            public void onError(ApiResponseException e) {

            }
        }));
    }
}
