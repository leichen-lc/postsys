package com.xd.bean;

public class Identification {
   private Integer  identity_id;//认证编号
   private String  identity_card;//身份证号
   private String identity_image;//身份证正反面
   private Integer  Identity_status;// 认证状态
   private Integer  identity_person;//所属人

    public Identification() {
    }

    public Identification(Integer identity_id, String identity_card, String identity_image, Integer identity_status, Integer identity_person) {
        this.identity_id = identity_id;
        this.identity_card = identity_card;
        this.identity_image = identity_image;
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

    public String getIdentity_image() {
        return identity_image;
    }

    public void setIdentity_image(String identity_image) {
        this.identity_image = identity_image;
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
                ", identity_image='" + identity_image + '\'' +
                ", Identity_status=" + Identity_status +
                ", identity_person=" + identity_person +
                '}';
    }
}
