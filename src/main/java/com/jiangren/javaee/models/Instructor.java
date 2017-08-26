package com.jiangren.javaee.models;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

/**
 * Created by seabookchen on 22/08/2017.
 */
public class Instructor {
    private Long id;
    private String firstName;
    private String lastName;
    private String linkedInProfileUrl;
    private String bio;
    private List<Course> courses;



}
