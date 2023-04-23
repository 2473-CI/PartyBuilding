package com.ru.springboot3.model;

import java.util.Date;

public class Commend {
    private Integer id;

    private String commendtitle;

    private String partyname;

    private String commenduserid;

    private String commendusername;

    private String commendcontext;

    private Date commendtime;

    private String commendcause;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommendtitle() {
        return commendtitle;
    }

    public void setCommendtitle(String commendtitle) {
        this.commendtitle = commendtitle;
    }

    public String getPartyname() {
        return partyname;
    }

    public void setPartyname(String partyname) {
        this.partyname = partyname;
    }

    public String getCommenduserid() {
        return commenduserid;
    }

    public void setCommenduserid(String commenduserid) {
        this.commenduserid = commenduserid;
    }

    public String getCommendusername() {
        return commendusername;
    }

    public void setCommendusername(String commendusername) {
        this.commendusername = commendusername;
    }

    public String getCommendcontext() {
        return commendcontext;
    }

    public void setCommendcontext(String commendcontext) {
        this.commendcontext = commendcontext;
    }

    public Date getCommendtime() {
        return commendtime;
    }

    public void setCommendtime(Date commendtime) {
        this.commendtime = commendtime;
    }

    public String getCommendcause() {
        return commendcause;
    }

    public void setCommendcause(String commendcause) {
        this.commendcause = commendcause;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commendtitle=").append(commendtitle);
        sb.append(", partyname=").append(partyname);
        sb.append(", commenduserid=").append(commenduserid);
        sb.append(", commendusername=").append(commendusername);
        sb.append(", commendcontext=").append(commendcontext);
        sb.append(", commendtime=").append(commendtime);
        sb.append(", commendcause=").append(commendcause);
        sb.append("]");
        return sb.toString();
    }
}