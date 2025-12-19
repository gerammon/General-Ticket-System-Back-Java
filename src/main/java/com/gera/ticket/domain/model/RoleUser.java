package com.gera.ticket.domain.model;

public class RoleUser {
    private final int idRoleUser;
    private final int idRole;
    private final int idUser;

    public RoleUser(int idRoleUser, int idRole, int idUser) {
        this.idRoleUser = idRoleUser;
        this.idRole = idRole;
        this.idUser = idUser;
    }

    public int getIdRoleUser() {
        return this.idRoleUser;
    }
    public int getIdRole() {
        return this.idRole;
    }
    public int getIdUser() {
        return this.idUser;
    }
}
