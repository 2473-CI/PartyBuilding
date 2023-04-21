package com.ru.springboot3.model;

public class User {
    private Integer id;

    private String name;

    private String role;

    private String identitycard;

    private String partyid;

    private String phone;

    private String email;

    private String belongto;

    private String username;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public String getPartyid() {
        return partyid;
    }

    public void setPartyid(String partyid) {
        this.partyid = partyid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBelongto() {
        return belongto;
    }

    public void setBelongto(String belongto) {
        this.belongto = belongto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", role=").append(role);
        sb.append(", identitycard=").append(identitycard);
        sb.append(", partyid=").append(partyid);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", belongto=").append(belongto);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append("]");
        return sb.toString();
    }
}