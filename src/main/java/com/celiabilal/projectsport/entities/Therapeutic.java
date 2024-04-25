package com.celiabilal.projectsport.entities;

import jakarta.persistence.*;
import org.springframework.boot.convert.DataSizeUnit;

import java.util.List;

@Entity
@Table(name = "therapeutic")
public class Therapeutic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(
            name = "therapeutic_activity",
            joinColumns = @JoinColumn(name = "therapeutic_id"),
            inverseJoinColumns = @JoinColumn(name = "activity_id")
    )
    private List<Activity> activities;


    public User getUser() {
        return user;
    }

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
