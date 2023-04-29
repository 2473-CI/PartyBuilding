package com.ru.springboot3.model;

import java.util.Date;

public class Examination {
    private Integer id;

    private String examinationtitle;

    private Date examinationstarttime;

    private Date examinationendtime;

    private Double source;

    private String belongto;

    private Integer userid;

    private String username;

    private String examination;

    private String examinationsubmit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExaminationtitle() {
        return examinationtitle;
    }

    public void setExaminationtitle(String examinationtitle) {
        this.examinationtitle = examinationtitle;
    }

    public Date getExaminationstarttime() {
        return examinationstarttime;
    }

    public void setExaminationstarttime(Date examinationstarttime) {
        this.examinationstarttime = examinationstarttime;
    }

    public Date getExaminationendtime() {
        return examinationendtime;
    }

    public void setExaminationendtime(Date examinationendtime) {
        this.examinationendtime = examinationendtime;
    }

    public Double getSource() {
        return source;
    }

    public void setSource(Double source) {
        this.source = source;
    }

    public String getBelongto() {
        return belongto;
    }

    public void setBelongto(String belongto) {
        this.belongto = belongto;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getExamination() {
        return examination;
    }

    public void setExamination(String examination) {
        this.examination = examination;
    }

    public String getExaminationsubmit() {
        return examinationsubmit;
    }

    public void setExaminationsubmit(String examinationsubmit) {
        this.examinationsubmit = examinationsubmit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", examinationtitle=").append(examinationtitle);
        sb.append(", examinationstarttime=").append(examinationstarttime);
        sb.append(", examinationendtime=").append(examinationendtime);
        sb.append(", source=").append(source);
        sb.append(", belongto=").append(belongto);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", examination=").append(examination);
        sb.append(", examinationsubmit=").append(examinationsubmit);
        sb.append("]");
        return sb.toString();
    }
}