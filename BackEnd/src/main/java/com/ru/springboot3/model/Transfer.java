package com.ru.springboot3.model;

import java.util.Date;

public class Transfer {
    private Integer id;

    private String frombelongto;

    private String tobelongto;

    private Integer userid;

    private String name;

    private String initiator;

    private String recipient;

    private String status;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrombelongto() {
        return frombelongto;
    }

    public void setFrombelongto(String frombelongto) {
        this.frombelongto = frombelongto;
    }

    public String getTobelongto() {
        return tobelongto;
    }

    public void setTobelongto(String tobelongto) {
        this.tobelongto = tobelongto;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", frombelongto=").append(frombelongto);
        sb.append(", tobelongto=").append(tobelongto);
        sb.append(", userid=").append(userid);
        sb.append(", name=").append(name);
        sb.append(", initiator=").append(initiator);
        sb.append(", recipient=").append(recipient);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append("]");
        return sb.toString();
    }
}