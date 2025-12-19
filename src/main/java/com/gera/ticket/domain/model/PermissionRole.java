package com.gera.ticket.domain.model;

public class PermissionRole {
    private final int idPermissionRole;
    private final int idPermission;
    private final int idRole;

    public PermissionRole(int idPermissionRole, int idPermission, int idRole) {
        this.idPermissionRole = idPermissionRole;
        this.idPermission = idPermission;
        this.idRole = idRole;
    }

    public int getIdPermissionRole() {
        return this.idPermissionRole;
    };
    public int getIdPermission() {
        return this.idPermission;
    };
    public int getIdRole() {
        return this.idRole;
    };

}
