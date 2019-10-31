package com.xd.bean;





public class JobInformation {
    private Integer job_id;//工作名称
    private String job_time;//工作日时间

    private String job_untime;//非工作时间
    private String job_address;//可工作地址
    private String province;
    private String city;
    private Integer job_hours;//周工作时长
    private Double job_daysal;//日薪
    private String job_pattern;//工作形式
    private Integer job_person;//所属人

    public JobInformation() {
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public JobInformation(Integer job_id, String job_time, String job_untime, String job_address, String province, String city, Integer job_hours, Double job_daysal, String job_pattern, Integer job_person) {
        this.job_id = job_id;
        this.job_time = job_time;
        this.job_untime = job_untime;
        this.job_address = job_address;
        this.province = province;
        this.city = city;
        this.job_hours = job_hours;
        this.job_daysal = job_daysal;
        this.job_pattern = job_pattern;
        this.job_person = job_person;
    }

    public JobInformation(Integer job_id, String job_time, String job_untime, String job_address, Integer job_hours, Double job_daysal, String job_pattern, Integer job_person) {
        this.job_id = job_id;
        this.job_time = job_time;
        this.job_untime = job_untime;
        this.job_address = job_address;
        this.job_hours = job_hours;
        this.job_daysal = job_daysal;
        this.job_pattern = job_pattern;
        this.job_person = job_person;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public String getJob_time() {
        return job_time;
    }

    public void setJob_time(String job_time) {
        this.job_time = job_time;
    }

    public String getJob_untime() {
        return job_untime;
    }

    public void setJob_untime(String job_untime) {
        this.job_untime = job_untime;
    }

    public String getJob_address() {
        return job_address;
    }

    public void setJob_address(String job_address) {
        this.job_address = job_address;
    }

    public Integer getJob_hours() {
        return job_hours;
    }

    public void setJob_hours(Integer job_hours) {
        this.job_hours = job_hours;
    }

    public Double getJob_daysal() {
        return job_daysal;
    }

    public void setJob_daysal(Double job_daysal) {
        this.job_daysal = job_daysal;
    }

    public String getJob_pattern() {
        return job_pattern;
    }

    public void setJob_pattern(String job_pattern) {
        this.job_pattern = job_pattern;
    }

    public Integer getJob_person() {
        return job_person;
    }

    public void setJob_person(Integer job_person) {
        this.job_person = job_person;
    }

    @Override
    public String toString() {
        return "JobInformation{" +
                "job_id=" + job_id +
                ", job_time='" + job_time + '\'' +
                ", job_untime='" + job_untime + '\'' +
                ", job_address='" + job_address + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", job_hours=" + job_hours +
                ", job_daysal=" + job_daysal +
                ", job_pattern='" + job_pattern + '\'' +
                ", job_person=" + job_person +
                '}';
    }
}
