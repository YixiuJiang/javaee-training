package com.jiangren.javaee;

import com.jiangren.javaee.models.Course;
import com.jiangren.javaee.repositories.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
            Map<String,String> courses = new HashMap<String, String>()
            {
                {
                    put("java", "This is an good java class taught by Seabook");
                    put("ruby", "What's ruby?");
                    put("javascript", "why javascript?");
                }
            };

            courses.entrySet().forEach(entry -> courseRepository.save(new Course(entry.getKey(), entry.getValue())));

            courseRepository.findAll().forEach(System.out::println);

            courseRepository.findByName("java").forEach(System.out::println);
        };
    }
}
