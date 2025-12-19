package com.gera.ticket.domain.model;

public class TurnState {
    private final int idTurnState;
    private final String name;
    private final String explanation;

    public TurnState(
        int idTurnState,
        String name,
        String explanation
    ) {
        this.idTurnState = idTurnState;
        this.name = name;
        this.explanation = explanation;
    }

    public int getIdTurnState() {
        return this.idTurnState;
    }
    public String getName() {
        return this.name;
    }
    public String getExplanation() {
        return this.explanation;
    }
}
