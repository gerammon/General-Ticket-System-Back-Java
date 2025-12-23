package com.gera.ticket.domain.port;

import com.gera.ticket.domain.criteria.TurnSearchCriteria;
import com.gera.ticket.domain.model.Turn;

import java.util.List;
import java.util.Optional;

public interface TurnRepository {

    Optional<Turn> getById(int id);

    List<Turn> search(TurnSearchCriteria criteria);

    int save(Turn turn);

    void delete(int id);

}
