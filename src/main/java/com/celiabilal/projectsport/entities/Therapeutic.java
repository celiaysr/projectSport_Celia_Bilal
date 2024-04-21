package com.celiabilal.projectsport.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.springframework.boot.convert.DataSizeUnit;

import java.util.List;

@Entity
@Table(name = "therapeutic")
public class Therapeutic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "rating", nullable = true)
    private int rating;

    public Therapeutic(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
