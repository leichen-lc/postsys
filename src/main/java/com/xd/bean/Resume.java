package com.xd.bean;

public class Resume {
   private Integer resume_id;//简历编号
   private String  resume_workstatus;// 工作状态
   private String  resume_workdirection;//职业方向
   private String  resume_specificwork;// 具体工作
   private Integer resume_skill;// 技能
   private Integer resume_works;//  个人作品
   private String resume_introduce;// 个人介绍
   private Integer resume_person;//所属人

    public Resume() {
    }

    public Resume(Integer resume_id, String resume_workstatus, String resume_workdirection, String resume_specificwork, Integer resume_skill, Integer resume_works, String resume_introduce, Integer resume_person) {
        this.resume_id = resume_id;
        this.resume_workstatus = resume_workstatus;
        this.resume_workdirection = resume_workdirection;
        this.resume_specificwork = resume_specificwork;
        this.resume_skill = resume_skill;
        this.resume_works = resume_works;
        this.resume_introduce = resume_introduce;
        this.resume_person = resume_person;
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

    public String getResume_specificwork() {
        return resume_specificwork;
    }

    public void setResume_specificwork(String resume_specificwork) {
        this.resume_specificwork = resume_specificwork;
    }

    public Integer getResume_skill() {
        return resume_skill;
    }

    public void setResume_skill(Integer resume_skill) {
        this.resume_skill = resume_skill;
    }

    public Integer getResume_works() {
        return resume_works;
    }

    public void setResume_works(Integer resume_works) {
        this.resume_works = resume_works;
    }

    public String getResume_introduce() {
        return resume_introduce;
    }

    public void setResume_introduce(String resume_introduce) {
        this.resume_introduce = resume_introduce;
    }

    public Integer getResume_person() {
        return resume_person;
    }

    public void setResume_person(Integer resume_person) {
        this.resume_person = resume_person;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "resume_id=" + resume_id +
                ", resume_workstatus='" + resume_workstatus + '\'' +
                ", resume_workdirection='" + resume_workdirection + '\'' +
                ", resume_specificwork='" + resume_specificwork + '\'' +
                ", resume_skill=" + resume_skill +
                ", resume_works=" + resume_works +
                ", resume_introduce='" + resume_introduce + '\'' +
                ", resume_person=" + resume_person +
                '}';
    }
}
