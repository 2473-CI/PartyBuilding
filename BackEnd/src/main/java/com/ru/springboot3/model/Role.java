package com.ru.springboot3.model;

public class Role {
    private Integer id;

    private String rolename;

    private Integer rolegrade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getRolegrade() {
        return rolegrade;
    }

    public void setRolegrade(Integer rolegrade) {
        this.rolegrade = rolegrade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rolename=").append(rolename);
        sb.append(", rolegrade=").append(rolegrade);
        sb.append("]");
        return sb.toString();
    }
}