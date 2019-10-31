package com.xd.service;

import com.xd.bean.*;
import com.xd.dao.SignDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignServiceImpl implements SignService {
    @Autowired
    private SignDao sd;


    @Override
    public List<Project> findAll() {
        return sd.findAll();
    }

    @Override
    public List<Project> findByid(Integer project_id) {
        return sd.findByid(project_id);
    }

    @Override
    public List<Resume> findRes(Integer resume_person) {
        return sd.findRes(resume_person);
    }

    @Override
    public Integer findId(String user_email) {
        return sd.findId(user_email);
    }


    @Override
    public boolean addJob(JobInformation job) {
        return sd.addJob(job);
    }

    @Override
    public boolean addJobs(Jobs jobs) {
        return sd.addJobs(jobs);
    }

    @Override
    public boolean addEdu(Education edu) {
        return sd.addEdu(edu);
    }

    @Override
    public boolean addRes(Resume res) {
        return sd.addRes(res);
    }

    @Override
    public boolean addSki(Skills ski) {
        return sd.addSki(ski);
    }

    @Override
    public boolean addWor(Works wor) {
        return sd.addWor(wor);
    }

    @Override
    public boolean addIde(Identification ide) {
        return sd.addIde(ide);
    }
}
