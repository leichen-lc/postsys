package com.xd.bean;

import java.util.Date;

public class Jobs {
    private Integer jobs_id;
    private String time;
    private String  company;
    private String position;
    private Integer jobs_user;

    public Jobs() {

    }

    public Jobs(Integer jobs_id, String time, String company, String position, Integer jobs_user) {
        this.jobs_id = jobs_id;
        this.time = time;
        this.company = company;
        this.position = position;
        this.jobs_user = jobs_user;
    }

    public Integer getJobs_id() {
        return jobs_id;
    }

    public void setJobs_id(Integer jobs_id) {
        this.jobs_id = jobs_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getJobs_user() {
        return jobs_user;
    }

    public void setJobs_user(Integer jobs_user) {
        this.jobs_user = jobs_user;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "jobs_id=" + jobs_id +
                ", time='" + time + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", jobs_user=" + jobs_user +
                '}';
    }
}
