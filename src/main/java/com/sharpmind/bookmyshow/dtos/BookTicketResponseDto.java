package com.sharpmind.bookmyshow.dtos;

import com.sharpmind.bookmyshow.models.Ticket;
import lombok.Data;

@Data
public class BookTicketResponseDto {
    private Ticket ticket;
    private String errorMessage;
    private ResponseType responseType;
}
