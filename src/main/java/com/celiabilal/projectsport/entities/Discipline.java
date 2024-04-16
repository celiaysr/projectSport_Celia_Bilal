package com.celiabilal.projectsport.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "discipline")
public class Discipline {

    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "discipline", targetEntity = Activity.class)
    private List<Activity> activities;

    public Discipline(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
