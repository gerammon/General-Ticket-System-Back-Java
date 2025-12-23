package com.gera.ticket.domain.port;

import com.gera.ticket.domain.criteria.RoleUserSearchCriteria;
import com.gera.ticket.domain.model.RoleUser;

import java.util.List;
import java.util.Optional;

public interface RoleUserRepository {

    Optional<RoleUser> getById(int id);

    List<RoleUser> search(RoleUserSearchCriteria criteria);

    int save(RoleUser roleUser);

    void delete(int id);

}
