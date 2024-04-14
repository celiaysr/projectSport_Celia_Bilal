package com.celiabilal.projectsport.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Genre {

    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "genre", targetEntity = User.class)
    private List<User> users;

    public Genre(){}

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
}
