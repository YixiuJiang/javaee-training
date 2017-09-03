package com.jiangren.javaee;

import com.jiangren.javaee.models.Category;
import com.jiangren.javaee.models.Course;
import com.jiangren.javaee.models.Instructor;
import com.jiangren.javaee.repositories.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    @Bean
    CommandLineRunner runner(CourseRepository courseRepository) {
        return (args) -> {
            Course course = new Course();
            course.setName("Java");
            course.setDescription("This is a good Java course");


            Instructor instructor = new Instructor();
            instructor.setFirstName("Seabook");
            instructor.setLastName("Chen");
            instructor.setLinkedInProfileUrl("linkedin");
            instructor.setBio("This is the bio");

            Category category = new Category();
            category.setName("Programming Language");
            category.setDescription("This category is designed for programming");


            course.setInstructor(instructor);
            Set categories = new HashSet<Category>();
            categories.add(category);
            course.setCategories(categories);

            courseRepository.save(course);
        };
    }
}
