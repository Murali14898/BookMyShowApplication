package com.sharpmind.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;
//Show is a reserved keyword in mysql we write the name
@Data
@Entity(name = "shows")
public class Show extends BaseModel{
    private Movie movie;
    private Screen screen;
    private Date startTime;
    private Date endTime;
}