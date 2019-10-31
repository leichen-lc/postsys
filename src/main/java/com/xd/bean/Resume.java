package com.xd.bean;



public class Resume {
    private Integer resume_id;//简历编号
    private String  resume_workstatus;// 工作状态
    private String  resume_workdirection;//职业方向
    private String  resume_jobs;// 具体工作
    private Integer resume_person;//所属人
    private String time;//工作时间
    private String  company;//公司
    private String position;//职位
    private String education_date;//教育时间
    private String school_name;//  学校名称
    private String profession;//专业
    private String education_level;//学历层次

    public Resume() {
    }

    public Resume(Integer resume_id, String resume_workstatus, String resume_workdirection, String resume_jobs, Integer resume_person) {
        this.resume_id = resume_id;
        this.resume_workstatus = resume_workstatus;
        this.resume_workdirection = resume_workdirection;
        this.resume_jobs = resume_jobs;
        this.resume_person = resume_person;
    }

    public Resume(Integer resume_id, String resume_workstatus, String resume_workdirection, String resume_jobs, Integer resume_person, String time, String company, String position, String education_date, String school_name, String profession, String education_level) {
        this.resume_id = resume_id;
        this.resume_workstatus = resume_workstatus;
        this.resume_workdirection = resume_workdirection;
        this.resume_jobs = resume_jobs;
        this.resume_person = resume_person;
        this.time = time;
        this.company = company;
        this.position = position;
        this.education_date = education_date;
        this.school_name = school_name;
        this.profession = profession;
        this.education_level = education_level;
    }

    public Integer getResume_id() {
        return resume_id;
    }

    public void setResume_id(Integer resume_id) {
        this.resume_id = resume_id;
    }

    public String getResume_workstatus() {
        return resume_workstatus;
    }

    public void setResume_workstatus(String resume_workstatus) {
        this.resume_workstatus = resume_workstatus;
    }

    public String getResume_workdirection() {
        return resume_workdirection;
    }

    public void setResume_workdirection(String resume_workdirection) {
        this.resume_workdirection = resume_workdirection;
    }

    public String getResume_jobs() {
        return resume_jobs;
    }

    public void setResume_jobs(String resume_jobs) {
        this.resume_jobs = resume_jobs;
    }

    public Integer getResume_person() {
        return resume_person;
    }

    public void setResume_person(Integer resume_person) {
        this.resume_person = resume_person;
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

    public String getEducation_date() {
        return education_date;
    }

    public void setEducation_date(String education_date) {
        this.education_date = education_date;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEducation_level() {
        return education_level;
    }

    public void setEducation_level(String education_level) {
        this.education_level = education_level;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "resume_id=" + resume_id +
                ", resume_workstatus='" + resume_workstatus + '\'' +
                ", resume_workdirection='" + resume_workdirection + '\'' +
                ", resume_jobs='" + resume_jobs + '\'' +
                ", resume_person=" + resume_person +
                ", time='" + time + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", education_date='" + education_date + '\'' +
                ", school_name='" + school_name + '\'' +
                ", profession='" + profession + '\'' +
                ", education_level='" + education_level + '\'' +
                '}';
    }
}
