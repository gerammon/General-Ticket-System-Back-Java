package com.gera.ticket.domain.criteria;

public record PermissionRoleSearchCriteria(
        Integer idPermissionRole,
        Integer idPermission,
        Integer idRole
) {
}
