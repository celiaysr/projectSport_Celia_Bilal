package com.celiabilal.projectsport.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    private int Id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private int age;

    @ManyToOne
    @JoinColumn(name="id")
    private Genre genre;

    @ManyToMany(mappedBy = "user", targetEntity = Pathology.class)
    private List<Pathology> pathologies;

    @OneToOne(targetEntity = Therapeutic.class)
    private Therapeutic therapeutic;

    public User(){}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Pathology> getPathologies() {
        return pathologies;
    }

    public void setPathologies(List<Pathology> pathologies) {
        this.pathologies = pathologies;
    }

    public Therapeutic getTherapeutic() {
        return therapeutic;
    }

    public void setTherapeutic(Therapeutic therapeutic) {
        this.therapeutic = therapeutic;
    }
}
