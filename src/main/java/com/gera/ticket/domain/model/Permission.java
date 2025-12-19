package com.gera.ticket.domain.model;

public class Permission {
    private final int idPermission;
    private final String name;
    private final String explanation;

    public Permission(
            int idPermission, String name, String explanation
    ) {
        this.idPermission = idPermission;
        this.name = name;
        this.explanation = explanation;
    }

    public int getIdPermission() {
      return this.idPermission;
    }
    public String getName() {
        return this.name;
    }
    public String getExplanation() {
        return this.explanation;
    }

}
