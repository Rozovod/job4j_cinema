package ru.job4j.cinema.service;

import ru.job4j.cinema.model.Ticket;

import java.util.Collection;

public class SimpleTicketService implements TicketService {
    private final TicketService ticketService;

    public SimpleTicketService(TicketService sql2oTicketService) {
        this.ticketService = sql2oTicketService;
    }

    @Override
    public Collection<Ticket> findAll() {
        return ticketService.findAll();
    }
}
