package com.ru.springboot3.model;

import java.util.Date;

public class Activity {
    private Integer id;

    private Date starttime;

    private Date endtime;

    private String activityaddress;

    private String activitytitle;

    private String belongto;

    private String activitycontext;

    private String activitymumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getActivityaddress() {
        return activityaddress;
    }

    public void setActivityaddress(String activityaddress) {
        this.activityaddress = activityaddress;
    }

    public String getActivitytitle() {
        return activitytitle;
    }

    public void setActivitytitle(String activitytitle) {
        this.activitytitle = activitytitle;
    }

    public String getBelongto() {
        return belongto;
    }

    public void setBelongto(String belongto) {
        this.belongto = belongto;
    }

    public String getActivitycontext() {
        return activitycontext;
    }

    public void setActivitycontext(String activitycontext) {
        this.activitycontext = activitycontext;
    }

    public String getActivitymumber() {
        return activitymumber;
    }

    public void setActivitymumber(String activitymumber) {
        this.activitymumber = activitymumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", activityaddress=").append(activityaddress);
        sb.append(", activitytitle=").append(activitytitle);
        sb.append(", belongto=").append(belongto);
        sb.append(", activitycontext=").append(activitycontext);
        sb.append(", activitymumber=").append(activitymumber);
        sb.append("]");
        return sb.toString();
    }
}