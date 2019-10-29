package com.xd.bean;

public class Project {
    private  Integer project_id;//项目编号
    private String project_name;//项目名称
    private Double project_butget;//项目预算
    private  String project_introduce;//项目介绍
    private  String project_file;//项目文档
    private Integer project_publisher;//项目发布者

    public Project() {
    }

    public Project(Integer project_id, String project_name, Double project_butget, String project_introduce, String project_file, Integer project_publisher) {
        this.project_id = project_id;
        this.project_name = project_name;
        this.project_butget = project_butget;
        this.project_introduce = project_introduce;
        this.project_file = project_file;
        this.project_publisher = project_publisher;
    }

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public Double getProject_butget() {
        return project_butget;
    }

    public void setProject_butget(Double project_butget) {
        this.project_butget = project_butget;
    }

    public String getProject_introduce() {
        return project_introduce;
    }

    public void setProject_introduce(String project_introduce) {
        this.project_introduce = project_introduce;
    }

    public String getProject_file() {
        return project_file;
    }

    public void setProject_file(String project_file) {
        this.project_file = project_file;
    }

    public Integer getProject_publisher() {
        return project_publisher;
    }

    public void setProject_publisher(Integer project_publisher) {
        this.project_publisher = project_publisher;
    }

    @Override
    public String toString() {
        return "Project{" +
                "project_id=" + project_id +
                ", project_name='" + project_name + '\'' +
                ", project_butget=" + project_butget +
                ", project_introduce='" + project_introduce + '\'' +
                ", project_file='" + project_file + '\'' +
                ", project_publisher=" + project_publisher +
                '}';
    }
}
