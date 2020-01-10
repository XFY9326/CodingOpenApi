## CodingOpenApi  
基于Coding.net的[开放API文档](https://open.coding.net/open-api/)编写的Java版本SDK  


-----   
### 使用前提示：  
1. 本项目使用了Okhttp3与Gson进行网络请求与处理，如有冲突请注意  
2. 建议使用前先去看官方的API文档

-----

### 使用方法

示例：

    OpenApi.getInstance().request(Projects.getProjectInfo("", "", new ApiResponseListener<ProjectInfo>() {
        @Override
        public void onResponse(ApiResponse<ProjectInfo> response) {

        }

        @Override
        public void onError(ApiResponseException e) {

        }
     }));

1. 获取OpenApi实例 


    OpenApi.getInstance()

2. 从services.api包下的类中选取需要请求的方法  


    // 示例为获取项目信息
    Projects.getProjectInfo()  

3. 填写参数，构建Api对象，进行请求  


    ... .request(Projects.getProjectInfo(..., ..., ...)

4. 通过接口返回请求结果  


    // ProjectInfo为返回的json的JavaBean对象
    // 支持使用List，String等
    new ApiResponseListener<ProjectInfo>() { ... }

----  

### 注意
本SDK只使用了文档中提及的API，但实际上仍然有部分API没有被写入官方文档  
例如：

    查询项目下所有发行版本的信息：
    公开项目不需要鉴权，私有项目需要鉴权
    
    https://dev.tencent.com/api/user/{username}/project/{project_name}}/git/releases/  
    
    username: 用户名
    project_name: 项目名

如果有需要，可以自行编写使用，添加方法直接参考源码services.api包下的类即可  

----  
 
### 开源协议

    CodingOpenApi
    Copyright (C) 2020 XFY9326

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.