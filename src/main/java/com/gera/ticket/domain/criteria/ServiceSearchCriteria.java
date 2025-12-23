package com.gera.ticket.domain.criteria;

public record ServiceSearchCriteria(
        int idService,
        int idOwnerService,
        String name,
        boolean canSaveTurns,
        String explanation
) {
}
