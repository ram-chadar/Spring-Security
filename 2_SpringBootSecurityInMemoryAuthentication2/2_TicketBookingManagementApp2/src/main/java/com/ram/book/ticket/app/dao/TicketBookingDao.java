package com.ram.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.ram.book.ticket.app.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
