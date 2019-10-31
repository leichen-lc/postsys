package com.xd.bean;

public class Works {

    private Integer works_id;//作品编号
    private String  works_name;//作品名称
    private String works_trade;// 所属行业
    private String  works_keyword;//关键词
    private String works_href;// 作品链接

    private String   works_image;//  作品截图
    private Integer works_person;//所属人


    private String skill_name;//技能名称
    private String skill_evaluate;// 经验自评

    public Works(Integer works_id, String works_name, String works_trade, String works_keyword, String works_href, String works_image, Integer works_person, String skill_name, String skill_evaluate) {
        this.works_id = works_id;
        this.works_name = works_name;
        this.works_trade = works_trade;
        this.works_keyword = works_keyword;
        this.works_href = works_href;
        this.works_image = works_image;
        this.works_person = works_person;
        this.skill_name = skill_name;
        this.skill_evaluate = skill_evaluate;
    }



    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public String getSkill_evaluate() {
        return skill_evaluate;
    }

    public void setSkill_evaluate(String skill_evaluate) {
        this.skill_evaluate = skill_evaluate;
    }

    public Works() {
    }

    public Works(Integer works_id, String works_name, String works_trade, String works_keyword, String works_href,  String works_image, Integer works_person) {
        this.works_id = works_id;
        this.works_name = works_name;
        this.works_trade = works_trade;
        this.works_keyword = works_keyword;
        this.works_href = works_href;

        this.works_image = works_image;
        this.works_person = works_person;
    }

    public Integer getWorks_id() {
        return works_id;
    }

    public void setWorks_id(Integer works_id) {
        this.works_id = works_id;
    }

    public String getWorks_name() {
        return works_name;
    }

    public void setWorks_name(String works_name) {
        this.works_name = works_name;
    }

    public String getWorks_trade() {
        return works_trade;
    }

    public void setWorks_trade(String works_trade) {
        this.works_trade = works_trade;
    }

    public String getWorks_keyword() {
        return works_keyword;
    }

    public void setWorks_keyword(String works_keyword) {
        this.works_keyword = works_keyword;
    }

    public String getWorks_href() {
        return works_href;
    }

    public void setWorks_href(String works_href) {
        this.works_href = works_href;
    }


    public String getWorks_image() {
        return works_image;
    }

    public void setWorks_image(String works_image) {
        this.works_image = works_image;
    }

    public Integer getWorks_person() {
        return works_person;
    }

    public void setWorks_person(Integer works_person) {
        this.works_person = works_person;
    }

    @Override
    public String toString() {
        return "Works{" +
                "works_id=" + works_id +
                ", works_name='" + works_name + '\'' +
                ", works_trade='" + works_trade + '\'' +
                ", works_keyword='" + works_keyword + '\'' +
                ", works_href=" + works_href +
                ", works_image='" + works_image + '\'' +
                ", works_person=" + works_person +
                '}';
    }
}
