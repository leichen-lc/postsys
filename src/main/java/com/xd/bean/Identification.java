package com.xd.bean;

public class Identification {
   private Integer  identity_id;//认证编号
   private String  identity_card;//身份证号
   private  String workstu1;//身份证正面
   private  String workstu2;//身份证反面
    private Integer Identity_status;//认证状态
   private Integer  identity_person;//所属人

    public Identification() {
    }

    public Identification(Integer identity_id, String identity_card, String workstu1, String workstu2, Integer identity_status, Integer identity_person) {
        this.identity_id = identity_id;
        this.identity_card = identity_card;
        this.workstu1 = workstu1;
        this.workstu2 = workstu2;
        Identity_status = identity_status;
        this.identity_person = identity_person;
    }

    public Integer getIdentity_id() {
        return identity_id;
    }

    public void setIdentity_id(Integer identity_id) {
        this.identity_id = identity_id;
    }

    public String getIdentity_card() {
        return identity_card;
    }

    public void setIdentity_card(String identity_card) {
        this.identity_card = identity_card;
    }

    public String getWorkstu1() {
        return workstu1;
    }

    public void setWorkstu1(String workstu1) {
        this.workstu1 = workstu1;
    }

    public String getWorkstu2() {
        return workstu2;
    }

    public void setWorkstu2(String workstu2) {
        this.workstu2 = workstu2;
    }

    public Integer getIdentity_status() {
        return Identity_status;
    }

    public void setIdentity_status(Integer identity_status) {
        Identity_status = identity_status;
    }

    public Integer getIdentity_person() {
        return identity_person;
    }

    public void setIdentity_person(Integer identity_person) {
        this.identity_person = identity_person;
    }

    @Override
    public String toString() {
        return "Identification{" +
                "identity_id=" + identity_id +
                ", identity_card='" + identity_card + '\'' +
                ", workstu1='" + workstu1 + '\'' +
                ", workstu2='" + workstu2 + '\'' +
                ", Identity_status=" + Identity_status +
                ", identity_person=" + identity_person +
                '}';
    }
}
