package com.jiangren.javaee.repositories;

import com.jiangren.javaee.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by seabookchen on 28/08/2017.
 */
public interface CourseRepository extends JpaRepository<Course, Long> {

    // select * from book where name = :name
    Collection<Course> findByName(String name);
}
