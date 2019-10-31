package com.xd.bean;

public class Ree {
    private JobInformation job;
    private Resume res;
    private Works wor;
    private Identification ide;


    public Ree() {
    }
    public Ree(JobInformation job, Resume res, Works wor, Identification ide) {
        this.job = job;
        this.res = res;
        this.wor = wor;
        this.ide = ide;
    }


    public JobInformation getJob() {
        return job;
    }

    public void setJob(JobInformation job) {
        this.job = job;
    }

    public Resume getRes() {
        return res;
    }

    public void setRes(Resume res) {
        this.res = res;
    }

    public Works getWor() {
        return wor;
    }

    public void setWor(Works wor) {
        this.wor = wor;
    }

    public Identification getIde() {
        return ide;
    }

    public void setIde(Identification ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "Ree{" +
                "job=" + job +
                ", res=" + res +
                ", wor=" + wor +
                ", ide=" + ide +
                '}';
    }
}

