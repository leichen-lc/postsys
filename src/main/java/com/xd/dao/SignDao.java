package com.xd.dao;

import com.xd.bean.*;

import java.util.List;

public interface SignDao {
    List<Project> findAll();//查询项目需求列表
    List<Project> findByid(Integer project_id);
    List<Resume> findRes(Integer resume_person);
    Integer findId(String user_email);
    boolean addJob(JobInformation job);//添加工作信息
    boolean addJobs(Jobs jobs);//添加工作经历
    boolean addEdu(Education edu);//添加教育经历
    boolean addRes(Resume res);//添加履历
    boolean addSki(Skills ski);//添加技能
    boolean addWor(Works wor);//添加作品
    boolean addIde(Identification ide);//添加身份验证


}
