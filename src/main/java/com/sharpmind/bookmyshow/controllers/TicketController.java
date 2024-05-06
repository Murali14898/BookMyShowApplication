package com.sharpmind.bookmyshow.controllers;

import com.sharpmind.bookmyshow.dtos.BookTicketRequestDto;
import com.sharpmind.bookmyshow.dtos.BookTicketResponseDto;
import com.sharpmind.bookmyshow.dtos.ResponseType;
import com.sharpmind.bookmyshow.exceptions.InvalidRequestException;
import com.sharpmind.bookmyshow.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {
    TicketService ticketService;
    @Autowired
    public TicketController(TicketService ticketService){
        this.ticketService=ticketService;
    }
    public BookTicketResponseDto bookTicket(BookTicketRequestDto requestDto){
        BookTicketResponseDto responseDto=new BookTicketResponseDto();
        try{
            validateRequestDto(requestDto);
            this.ticketService.bookTicket(requestDto.getSeatIds(), requestDto.getShowId(), requestDto.getUserId());
        }catch (Exception e){
            responseDto.setResponseType(ResponseType.FAILURE);
            responseDto.setErrorMessage(e.getMessage());
        }
        return responseDto;
    }

    private void validateRequestDto(BookTicketRequestDto requestDto) throws InvalidRequestException {
        if(requestDto.getSeatIds()==null || requestDto.getSeatIds().isEmpty()){
            throw new InvalidRequestException("Seat should be selected");
        }
        if(requestDto.getUserId() < 0){
            throw new InvalidRequestException("User id seems to be invalid");
        }
        if(requestDto.getShowId() < 0){
            throw new InvalidRequestException("Show id seems to be invalid");
        }
    }
}
