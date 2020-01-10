package lib.xfy9326.coding.openapi.services.beans;

import java.util.List;

public class UserProjectList {
    private int page;
    private int pageSize;
    private int totalPage;
    private int totalRow;
    private List<ListBean> list;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "UserProjectList{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                ", totalPage=" + totalPage +
                ", totalRow=" + totalRow +
                ", list=" + list +
                '}';
    }

    public static class ListBean {
        private long created_at;
        private String backend_project_path;
        private String description;
        private String git_url;
        private String ssh_url;
        private String svn_url;
        private boolean is_public;
        private String https_url;
        private String vcs_type;
        private String subversion_url;
        private int id;
        private String name;
        private String display_name;
        private int owner_id;
        private String owner_user_name;
        private String owner_user_picture;
        private String owner_user_home;
        private String project_path;
        private int status;
        private int type;
        private long updated_at;
        private int fork_count;
        private int star_count;
        private int watch_count;
        private int download_count;
        private boolean pin;
        private String depot_path;
        private boolean forked;
        private int un_read_activities_count;
        private String icon;
        private int current_user_role_id;
        private boolean stared;
        private boolean watched;
        private int recommended;
        private boolean shared;
        private boolean is_member;
        private int max_member;
        private int groupId;
        private int plan;
        private boolean isTeam;
        private boolean isDemo;

        public long getCreated_at() {
            return created_at;
        }

        public void setCreated_at(long created_at) {
            this.created_at = created_at;
        }

        public String getBackend_project_path() {
            return backend_project_path;
        }

        public void setBackend_project_path(String backend_project_path) {
            this.backend_project_path = backend_project_path;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getGit_url() {
            return git_url;
        }

        public void setGit_url(String git_url) {
            this.git_url = git_url;
        }

        public String getSsh_url() {
            return ssh_url;
        }

        public void setSsh_url(String ssh_url) {
            this.ssh_url = ssh_url;
        }

        public String getSvn_url() {
            return svn_url;
        }

        public void setSvn_url(String svn_url) {
            this.svn_url = svn_url;
        }

        public boolean isIs_public() {
            return is_public;
        }

        public void setIs_public(boolean is_public) {
            this.is_public = is_public;
        }

        public String getHttps_url() {
            return https_url;
        }

        public void setHttps_url(String https_url) {
            this.https_url = https_url;
        }

        public String getVcs_type() {
            return vcs_type;
        }

        public void setVcs_type(String vcs_type) {
            this.vcs_type = vcs_type;
        }

        public String getSubversion_url() {
            return subversion_url;
        }

        public void setSubversion_url(String subversion_url) {
            this.subversion_url = subversion_url;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDisplay_name() {
            return display_name;
        }

        public void setDisplay_name(String display_name) {
            this.display_name = display_name;
        }

        public int getOwner_id() {
            return owner_id;
        }

        public void setOwner_id(int owner_id) {
            this.owner_id = owner_id;
        }

        public String getOwner_user_name() {
            return owner_user_name;
        }

        public void setOwner_user_name(String owner_user_name) {
            this.owner_user_name = owner_user_name;
        }

        public String getOwner_user_picture() {
            return owner_user_picture;
        }

        public void setOwner_user_picture(String owner_user_picture) {
            this.owner_user_picture = owner_user_picture;
        }

        public String getOwner_user_home() {
            return owner_user_home;
        }

        public void setOwner_user_home(String owner_user_home) {
            this.owner_user_home = owner_user_home;
        }

        public String getProject_path() {
            return project_path;
        }

        public void setProject_path(String project_path) {
            this.project_path = project_path;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public long getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(long updated_at) {
            this.updated_at = updated_at;
        }

        public int getFork_count() {
            return fork_count;
        }

        public void setFork_count(int fork_count) {
            this.fork_count = fork_count;
        }

        public int getStar_count() {
            return star_count;
        }

        public void setStar_count(int star_count) {
            this.star_count = star_count;
        }

        public int getWatch_count() {
            return watch_count;
        }

        public void setWatch_count(int watch_count) {
            this.watch_count = watch_count;
        }

        public int getDownload_count() {
            return download_count;
        }

        public void setDownload_count(int download_count) {
            this.download_count = download_count;
        }

        public boolean isPin() {
            return pin;
        }

        public void setPin(boolean pin) {
            this.pin = pin;
        }

        public String getDepot_path() {
            return depot_path;
        }

        public void setDepot_path(String depot_path) {
            this.depot_path = depot_path;
        }

        public boolean isForked() {
            return forked;
        }

        public void setForked(boolean forked) {
            this.forked = forked;
        }

        public int getUn_read_activities_count() {
            return un_read_activities_count;
        }

        public void setUn_read_activities_count(int un_read_activities_count) {
            this.un_read_activities_count = un_read_activities_count;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getCurrent_user_role_id() {
            return current_user_role_id;
        }

        public void setCurrent_user_role_id(int current_user_role_id) {
            this.current_user_role_id = current_user_role_id;
        }

        public boolean isStared() {
            return stared;
        }

        public void setStared(boolean stared) {
            this.stared = stared;
        }

        public boolean isWatched() {
            return watched;
        }

        public void setWatched(boolean watched) {
            this.watched = watched;
        }

        public int getRecommended() {
            return recommended;
        }

        public void setRecommended(int recommended) {
            this.recommended = recommended;
        }

        public boolean isShared() {
            return shared;
        }

        public void setShared(boolean shared) {
            this.shared = shared;
        }

        public boolean isIs_member() {
            return is_member;
        }

        public void setIs_member(boolean is_member) {
            this.is_member = is_member;
        }

        public int getMax_member() {
            return max_member;
        }

        public void setMax_member(int max_member) {
            this.max_member = max_member;
        }

        public int getGroupId() {
            return groupId;
        }

        public void setGroupId(int groupId) {
            this.groupId = groupId;
        }

        public int getPlan() {
            return plan;
        }

        public void setPlan(int plan) {
            this.plan = plan;
        }

        public boolean isIsTeam() {
            return isTeam;
        }

        public void setIsTeam(boolean isTeam) {
            this.isTeam = isTeam;
        }

        public boolean isIsDemo() {
            return isDemo;
        }

        public void setIsDemo(boolean isDemo) {
            this.isDemo = isDemo;
        }

        @Override
        public String toString() {
            return "ListBean{" +
                    "created_at=" + created_at +
                    ", backend_project_path='" + backend_project_path + '\'' +
                    ", description='" + description + '\'' +
                    ", git_url='" + git_url + '\'' +
                    ", ssh_url='" + ssh_url + '\'' +
                    ", svn_url='" + svn_url + '\'' +
                    ", is_public=" + is_public +
                    ", https_url='" + https_url + '\'' +
                    ", vcs_type='" + vcs_type + '\'' +
                    ", subversion_url='" + subversion_url + '\'' +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    ", display_name='" + display_name + '\'' +
                    ", owner_id=" + owner_id +
                    ", owner_user_name='" + owner_user_name + '\'' +
                    ", owner_user_picture='" + owner_user_picture + '\'' +
                    ", owner_user_home='" + owner_user_home + '\'' +
                    ", project_path='" + project_path + '\'' +
                    ", status=" + status +
                    ", type=" + type +
                    ", updated_at=" + updated_at +
                    ", fork_count=" + fork_count +
                    ", star_count=" + star_count +
                    ", watch_count=" + watch_count +
                    ", download_count=" + download_count +
                    ", pin=" + pin +
                    ", depot_path='" + depot_path + '\'' +
                    ", forked=" + forked +
                    ", un_read_activities_count=" + un_read_activities_count +
                    ", icon='" + icon + '\'' +
                    ", current_user_role_id=" + current_user_role_id +
                    ", stared=" + stared +
                    ", watched=" + watched +
                    ", recommended=" + recommended +
                    ", shared=" + shared +
                    ", is_member=" + is_member +
                    ", max_member=" + max_member +
                    ", groupId=" + groupId +
                    ", plan=" + plan +
                    ", isTeam=" + isTeam +
                    ", isDemo=" + isDemo +
                    '}';
        }
    }
}
