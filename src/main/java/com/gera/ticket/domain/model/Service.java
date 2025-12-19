package com.gera.ticket.domain.model;

public class Service {
    private final int idService;
    private final int idOwnerService;
    private final String name;
    private final boolean canSaveTurns;
    private final String explanation;

    public Service(
            int idService,
            int idOwnerService,
            String name,
            boolean canSaveTurns,
            String explanation
    ) {
        this.idService = idService;
        this.idOwnerService = idOwnerService;
        this.name = name;
        this.canSaveTurns = canSaveTurns;
        this.explanation = explanation;
    }

    public int getIdService() {
        return this.idService;
    }
    public int idOwnerService() {
        return this.idOwnerService;
    }
    public String getName() {
        return this.name;
    }
    public boolean getCanSaveTurns() {
        return this.canSaveTurns;
    }
    public String getExplanation() {
        return this.explanation;
    }
}
