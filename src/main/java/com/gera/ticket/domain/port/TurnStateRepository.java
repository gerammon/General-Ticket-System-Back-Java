package com.gera.ticket.domain.port;

import com.gera.ticket.domain.criteria.TurnSearchCriteria;
import com.gera.ticket.domain.model.TurnState;

import java.util.List;
import java.util.Optional;

public interface TurnStateRepository {

    Optional<TurnState> getById(int id);

    List<TurnState> search(TurnSearchCriteria criteria);

    int save(TurnState turnState);

    void delete(int id);

}
