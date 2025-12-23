package com.gera.ticket.domain.port;

import com.gera.ticket.domain.criteria.UserSearchCriteria;
import com.gera.ticket.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    Optional<User> getById(int id);

    List<User> search(UserSearchCriteria criteria);

    int save(User user);

    void delete(int id);

}
