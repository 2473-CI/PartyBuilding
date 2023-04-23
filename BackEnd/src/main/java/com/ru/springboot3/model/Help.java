package com.ru.springboot3.model;

public class Help {
    private Integer id;

    private String helpobject;

    private String helpobjectcard;

    private String helpobjectadress;

    private String helperpartyid;

    private String helpername;

    private String helpercard;

    private String helperaddress;

    private String helperbelongto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHelpobject() {
        return helpobject;
    }

    public void setHelpobject(String helpobject) {
        this.helpobject = helpobject;
    }

    public String getHelpobjectcard() {
        return helpobjectcard;
    }

    public void setHelpobjectcard(String helpobjectcard) {
        this.helpobjectcard = helpobjectcard;
    }

    public String getHelpobjectadress() {
        return helpobjectadress;
    }

    public void setHelpobjectadress(String helpobjectadress) {
        this.helpobjectadress = helpobjectadress;
    }

    public String getHelperpartyid() {
        return helperpartyid;
    }

    public void setHelperpartyid(String helperpartyid) {
        this.helperpartyid = helperpartyid;
    }

    public String getHelpername() {
        return helpername;
    }

    public void setHelpername(String helpername) {
        this.helpername = helpername;
    }

    public String getHelpercard() {
        return helpercard;
    }

    public void setHelpercard(String helpercard) {
        this.helpercard = helpercard;
    }

    public String getHelperaddress() {
        return helperaddress;
    }

    public void setHelperaddress(String helperaddress) {
        this.helperaddress = helperaddress;
    }

    public String getHelperbelongto() {
        return helperbelongto;
    }

    public void setHelperbelongto(String helperbelongto) {
        this.helperbelongto = helperbelongto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", helpobject=").append(helpobject);
        sb.append(", helpobjectcard=").append(helpobjectcard);
        sb.append(", helpobjectadress=").append(helpobjectadress);
        sb.append(", helperpartyid=").append(helperpartyid);
        sb.append(", helpername=").append(helpername);
        sb.append(", helpercard=").append(helpercard);
        sb.append(", helperaddress=").append(helperaddress);
        sb.append(", helperbelongto=").append(helperbelongto);
        sb.append("]");
        return sb.toString();
    }
}