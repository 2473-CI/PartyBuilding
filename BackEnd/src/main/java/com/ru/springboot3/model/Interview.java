package com.ru.springboot3.model;

import java.util.Date;

public class Interview {
    private Integer id;

    private String interviewee;

    private String interviewer;

    private String interviewlocation;

    private String context;

    private Date interviewtime;

    private String belongto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInterviewee() {
        return interviewee;
    }

    public void setInterviewee(String interviewee) {
        this.interviewee = interviewee;
    }

    public String getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(String interviewer) {
        this.interviewer = interviewer;
    }

    public String getInterviewlocation() {
        return interviewlocation;
    }

    public void setInterviewlocation(String interviewlocation) {
        this.interviewlocation = interviewlocation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getInterviewtime() {
        return interviewtime;
    }

    public void setInterviewtime(Date interviewtime) {
        this.interviewtime = interviewtime;
    }

    public String getBelongto() {
        return belongto;
    }

    public void setBelongto(String belongto) {
        this.belongto = belongto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", interviewee=").append(interviewee);
        sb.append(", interviewer=").append(interviewer);
        sb.append(", interviewlocation=").append(interviewlocation);
        sb.append(", context=").append(context);
        sb.append(", interviewtime=").append(interviewtime);
        sb.append(", belongto=").append(belongto);
        sb.append("]");
        return sb.toString();
    }
}