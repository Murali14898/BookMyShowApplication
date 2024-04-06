package com.sharpmind.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Data
@Entity
public class City extends BaseModel{

    private String name;
    @OneToMany(mappedBy = "city")
    private List<Theatre> theatres;
}
