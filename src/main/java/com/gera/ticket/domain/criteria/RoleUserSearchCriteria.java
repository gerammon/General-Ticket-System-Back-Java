package com.gera.ticket.domain.criteria;

public record RoleUserSearchCriteria(
        int idRoleUser,
        int idRole,
        int idUser
) {
}
