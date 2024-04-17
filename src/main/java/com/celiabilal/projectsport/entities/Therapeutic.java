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

    @OneToOne(targetEntity = User.class)
    private User user;

    @ManyToMany(mappedBy = "therapeutic",targetEntity = Activity.class)
    @Size(max = 5)
    private List<Activity> activities;

    @Column(name = "rating", nullable = true)
    private int rating;

    public Therapeutic(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
