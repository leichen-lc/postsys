package com.xd.service;

import com.xd.bean.*;

import java.util.List;

public interface SignService {
    List<Project> findAll();//查询项目需求列表
    List<Project> findByid(Integer project_id);
    List<Resume> findRes();
    boolean addJob(JobInformation job);//添加工作经历
    boolean addEdu(Education edu);//添加教育经历
    boolean addRes(Resume res);//添加履历
    boolean addSki(Skills ski);//添加技能
    boolean addWor(Works wor);//添加作品
    boolean addIde(Identification ide);//添加身份验证
}
