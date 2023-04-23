package com.ru.springboot3.model;

import java.util.Date;

public class Volunteer {
    private Integer id;

    private String user;

    private String partyid;

    private Date starttime;

    private Date endtime;

    private String volunteeraddress;

    private String volunteercontext;

    private String volunteertitle;

    private String belongto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPartyid() {
        return partyid;
    }

    public void setPartyid(String partyid) {
        this.partyid = partyid;
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

    public String getVolunteeraddress() {
        return volunteeraddress;
    }

    public void setVolunteeraddress(String volunteeraddress) {
        this.volunteeraddress = volunteeraddress;
    }

    public String getVolunteercontext() {
        return volunteercontext;
    }

    public void setVolunteercontext(String volunteercontext) {
        this.volunteercontext = volunteercontext;
    }

    public String getVolunteertitle() {
        return volunteertitle;
    }

    public void setVolunteertitle(String volunteertitle) {
        this.volunteertitle = volunteertitle;
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
        sb.append(", user=").append(user);
        sb.append(", partyid=").append(partyid);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", volunteeraddress=").append(volunteeraddress);
        sb.append(", volunteercontext=").append(volunteercontext);
        sb.append(", volunteertitle=").append(volunteertitle);
        sb.append(", belongto=").append(belongto);
        sb.append("]");
        return sb.toString();
    }
}