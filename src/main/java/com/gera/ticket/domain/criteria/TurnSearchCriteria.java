package com.gera.ticket.domain.criteria;

import java.time.LocalDateTime;

public record TurnSearchCriteria(
        int idTurn,
        int idTurnState,
        LocalDateTime startMeeting,
        LocalDateTime finalMeeting
) {
}
