package com.gera.ticket.domain.criteria;

public record UserSearchCriteria(
        int idUser,
        String nickname,
        String name,
        String lastname
) {
}
