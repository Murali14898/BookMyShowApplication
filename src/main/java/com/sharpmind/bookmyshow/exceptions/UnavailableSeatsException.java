package com.sharpmind.bookmyshow.exceptions;

public class UnavailableSeatsException extends Exception{
    public UnavailableSeatsException(){ super(); }
    public UnavailableSeatsException(String message){
        super(message);
    }
}
