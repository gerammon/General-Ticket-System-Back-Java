package com.gera.ticket.domain.port;

import com.gera.ticket.domain.criteria.ServiceSearchCriteria;
import com.gera.ticket.domain.model.Service;

import java.util.List;
import java.util.Optional;

public interface ServiceRepository {

    Optional<Service> getById(int id);

    List<Service> search(ServiceSearchCriteria criteria);

    int save(Service service);

    void delete(int id);
}
