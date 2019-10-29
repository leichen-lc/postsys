package com.xd.bean;

import java.util.Date;

public class Education {
   private Integer education_id;//编号
   private Date education_date;//时间
   //private Date education_end;// 结束时间
   private String school_name;//  学校名称
   private String profession;//专业
   private String education_level;//学历层次
   private Integer education_person;//所属人

    public Education() {
    }

    public Education(Integer education_id, Date education_date, String school_name, String profession, String education_level, Integer education_person) {
        this.education_id = education_id;
        this.education_date = education_date;

        this.school_name = school_name;
        this.profession = profession;
        this.education_level = education_level;
        this.education_person = education_person;
    }

    public Integer getEducation_id() {
        return education_id;
    }

    public void setEducation_id(Integer education_id) {
        this.education_id = education_id;
    }

    public Date getEducation_start() {
        return education_date;
    }

    public void setEducation_start(Date education_start) {
        this.education_date = education_start;
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

    public Integer getEducation_person() {
        return education_person;
    }

    public void setEducation_person(Integer education_person) {
        this.education_person = education_person;
    }

    @Override
    public String toString() {
        return "Education{" +
                "education_id=" + education_id +
                ", education_start=" + education_date +
                ", school_name='" + school_name + '\'' +
                ", profession='" + profession + '\'' +
                ", education_level='" + education_level + '\'' +
                ", education_person=" + education_person +
                '}';
    }
}
