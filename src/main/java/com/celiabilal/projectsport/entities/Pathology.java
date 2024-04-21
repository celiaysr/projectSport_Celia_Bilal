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

}
