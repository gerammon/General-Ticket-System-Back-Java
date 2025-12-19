package com.gera.ticket.domain.model;

public class Role {
    private final int idRole;
    private final String name;
    private final String explanation;

    public Role(int idRole, String name, String explanation) {
        this.idRole = idRole;
        this.name = name;
        this.explanation = explanation;
    }

    public int getIdRole(){
        return this.idRole;
    }
    public String getName(){
        return this.name;
    }
    public String getExplanation(){
        return this.explanation;
    }
}
