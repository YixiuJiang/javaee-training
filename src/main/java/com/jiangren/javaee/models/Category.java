package com.jiangren.javaee.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.google.gson.Gson;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by seabookchen on 22/08/2017.
 */
@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @ManyToMany(mappedBy = "categories", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Course> courses;

    public Category() {
    }

    public Category(Long id, String name, String description, Set<Course> courses) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.courses = courses;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

}
