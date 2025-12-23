package com.gera.ticket.domain.port;

import com.gera.ticket.domain.criteria.PermissionRoleSearchCriteria;
import com.gera.ticket.domain.model.PermissionRole;

import java.util.List;
import java.util.Optional;

public interface PermissionRoleRepository {

    Optional<PermissionRole> getById(int id);

    List<PermissionRole> search(PermissionRoleSearchCriteria criteria);

    int save(PermissionRole permissionRole);

    void delete(int id);
}
