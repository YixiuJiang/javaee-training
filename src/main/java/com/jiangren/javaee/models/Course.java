package com.jiangren.javaee.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.List;

/**
 * Created by seabookchen on 22/08/2017.
 */
public class Course {
    private Long id;
    private String name;
    private String description;

    public Course() {

    }

    public Course(Long id, String name, String description, Instructor instructor, List<Category> categoryList) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return id.equals(course.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
