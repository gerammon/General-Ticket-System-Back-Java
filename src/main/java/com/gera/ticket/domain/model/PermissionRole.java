package com.gera.ticket.domain.model;

public class PermissionRole {
    private final Integer idPermissionRole;
    private final Integer idPermission;
    private final Integer idRole;

    public PermissionRole(Integer idPermissionRole, Integer idPermission, Integer idRole) {
        this.idPermissionRole = idPermissionRole;
        this.idPermission = idPermission;
        this.idRole = idRole;
    }

    public Integer getIdPermissionRole() {
        return this.idPermissionRole;
    };
    public Integer getIdPermission() {
        return this.idPermission;
    };
    public Integer getIdRole() {
        return this.idRole;
    };

}
