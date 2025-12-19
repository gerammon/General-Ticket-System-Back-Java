package com.gera.ticket.domain.model;

import java.time.LocalDateTime;

public class Turn {
    private final int idTurn;
    private final int idTurnState;
    private final LocalDateTime startMeeting;
    private final LocalDateTime finalMeeting;

    public Turn(
        int idTurn,
        int idTurnState,
        LocalDateTime startMeeting,
        LocalDateTime finalMeeting
    ) {
        this.idTurn = idTurn;
        this.idTurnState = idTurnState;
        this.startMeeting = startMeeting;
        this.finalMeeting = finalMeeting;
    }

    public Turn(int idTurn, int idTurnState, LocalDateTime startMeeting) {
        this(idTurn, idTurnState, startMeeting, startMeeting.plusHours(1));
    }

    public int getIdTurn() {
        return this.idTurn;
    }
    public int getIdTurnState() {
        return this.idTurnState;
    }
    public LocalDateTime getStartMeeting() {
        return this.startMeeting;
    }
    public LocalDateTime getFinalMeeting() {
        return this.finalMeeting;
    }
}
