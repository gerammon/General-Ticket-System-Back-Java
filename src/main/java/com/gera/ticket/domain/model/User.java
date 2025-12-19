package com.gera.ticket.domain.model;

public class User {
    private final int idUser;
    private final String nickname;
    private final String name;
    private final String lastname;
    private final String pass;

    public User(int idUser, String nickname, String name, String lastname, String pass) {
        this.idUser = idUser;
        this.nickname = nickname;
        this.name = name;
        this.lastname = lastname;
        this.pass = pass;
    }

    public int idUser() {
        return idUser;
    }
    public String nickname() {
        return nickname;
    }
    public String name() {
        return name;
    }
    public String lastname() {
        return lastname;
    }
    public String pass() {
        return pass;
    }

}
