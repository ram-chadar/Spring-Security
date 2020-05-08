package com.ram.book.ticket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.book.ticket.app.dao.TicketBookingDao;
import com.ram.book.ticket.app.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findOne(ticketId);
	}
	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}
}
