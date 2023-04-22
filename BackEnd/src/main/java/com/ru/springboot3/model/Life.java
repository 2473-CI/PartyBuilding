package com.ru.springboot3.model;

public class Life {
    private Integer id;

    private String lifetitle;

    private String lifesubtitle;

    private String belongto;

    private String lifecontext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLifetitle() {
        return lifetitle;
    }

    public void setLifetitle(String lifetitle) {
        this.lifetitle = lifetitle;
    }

    public String getLifesubtitle() {
        return lifesubtitle;
    }

    public void setLifesubtitle(String lifesubtitle) {
        this.lifesubtitle = lifesubtitle;
    }

    public String getBelongto() {
        return belongto;
    }

    public void setBelongto(String belongto) {
        this.belongto = belongto;
    }

    public String getLifecontext() {
        return lifecontext;
    }

    public void setLifecontext(String lifecontext) {
        this.lifecontext = lifecontext;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", lifetitle=").append(lifetitle);
        sb.append(", lifesubtitle=").append(lifesubtitle);
        sb.append(", belongto=").append(belongto);
        sb.append(", lifecontext=").append(lifecontext);
        sb.append("]");
        return sb.toString();
    }
}