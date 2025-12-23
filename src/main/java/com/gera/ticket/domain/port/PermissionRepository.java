package com.gera.ticket.domain.port;

import com.gera.ticket.domain.criteria.PermissionSearchCriteria;
import com.gera.ticket.domain.model.Permission;

import java.util.List;


public interface PermissionRepository {

    Permission getById(int id);

    List<Permission> search(PermissionSearchCriteria criteria);

    int save(Permission permission);

    void delete(int id);

}
