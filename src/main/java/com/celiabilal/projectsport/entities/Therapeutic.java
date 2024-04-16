package com.celiabilal.projectsport.entities;

import org.springframework.boot.convert.DataSizeUnit;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "therapeutic")
public class Therapeutic {

    @Id
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
