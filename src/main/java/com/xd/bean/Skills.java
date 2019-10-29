package com.xd.bean;

public class Skills {

    private Integer skill_id;//技能编号
    private String skill_name;//技能名称
    private String skill_evaluate;// 经验自评
    private Integer skill_person;//   所属人

    public Skills() {

    }

    public Skills(Integer skill_id, String skill_name, String skill_evaluate, Integer skill_person) {
        this.skill_id = skill_id;
        this.skill_name = skill_name;
        this.skill_evaluate = skill_evaluate;
        this.skill_person = skill_person;
    }

    public Integer getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(Integer skill_id) {
        this.skill_id = skill_id;
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

    public Integer getSkill_person() {
        return skill_person;
    }

    public void setSkill_person(Integer skill_person) {
        this.skill_person = skill_person;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "skill_id=" + skill_id +
                ", skill_name='" + skill_name + '\'' +
                ", skill_evaluate='" + skill_evaluate + '\'' +
                ", skill_person=" + skill_person +
                '}';
    }
}