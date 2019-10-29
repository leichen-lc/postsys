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
    public List<Resume> findRes() {
        return sd.findRes();
    }


    @Override
    public boolean addJob(JobInformation job) {
        return sd.addJob(job);
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
