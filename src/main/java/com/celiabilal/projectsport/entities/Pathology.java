package com.celiabilal.projectsport.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pathology")
public class Pathology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "pathologies", targetEntity = User.class)
    private List<User> users;

    @ManyToMany(mappedBy = "pathologies", targetEntity = Activity.class)
    private List<Activity> activities;

    public Pathology(){}

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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
