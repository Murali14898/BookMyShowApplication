package com.sharpmind.bookmyshow.services;

import com.sharpmind.bookmyshow.exceptions.InvalidRequestException;
import com.sharpmind.bookmyshow.exceptions.UnavailableSeatsException;
import com.sharpmind.bookmyshow.models.Ticket;

import java.util.List;

public interface TicketService {
    public Ticket bookTicket(List<Integer> seatIds, int showId, int userId) throws InvalidRequestException, UnavailableSeatsException;
}
