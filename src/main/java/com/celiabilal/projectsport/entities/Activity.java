package com.celiabilal.projectsport.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;


    @ManyToOne(targetEntity = Discipline.class)
    @JoinColumn(name="id")
    private Discipline discipline;

    @Column(name = "address")
    private int address;

    @ManyToMany(mappedBy = "activity", targetEntity = Pathology.class)
    private List<Pathology> pathologies;

    @ManyToMany(mappedBy = "activity", targetEntity = Therapeutic.class)
    private List<Therapeutic> therapeutics;

    public Activity(){}

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public List<Pathology> getPathologies() {
        return pathologies;
    }

    public void setPathologies(List<Pathology> pathologies) {
        this.pathologies = pathologies;
    }

    public List<Therapeutic> getTherapeutics() {
        return therapeutics;
    }

    public void setTherapeutics(List<Therapeutic> therapeutics) {
        this.therapeutics = therapeutics;
    }
}
