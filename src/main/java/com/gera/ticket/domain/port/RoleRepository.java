package com.gera.ticket.domain.port;

import com.gera.ticket.domain.criteria.RoleSearchCriteria;
import com.gera.ticket.domain.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleRepository {

    Optional<Role> getById(int id);

    List<Role> search(RoleSearchCriteria criteria);

    int save(Role role);

    void delete(int id);

}
