package com.jiangren.javaee.models;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

/**
 * Created by seabookchen on 22/08/2017.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Instructor {
    private Long id;
    private String firstName;
    private String lastName;
    private String linkedInProfileUrl;
    private String avartaUrl;
    private String bio;
    private List<Course> courses;


    public Instructor() {

    }

    public Instructor(Long id, String firstName, String lastName, String linkedInProfileUrl, String avartaUrl, String bio, List<Course> courses) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.linkedInProfileUrl = linkedInProfileUrl;
        this.avartaUrl = avartaUrl;
        this.bio = bio;
        this.courses = courses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLinkedInProfileUrl() {
        return linkedInProfileUrl;
    }

    public void setLinkedInProfileUrl(String linkedInProfileUrl) {
        this.linkedInProfileUrl = linkedInProfileUrl;
    }

    public String getAvartaUrl() {
        return avartaUrl;
    }

    public void setAvartaUrl(String avartaUrl) {
        this.avartaUrl = avartaUrl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
