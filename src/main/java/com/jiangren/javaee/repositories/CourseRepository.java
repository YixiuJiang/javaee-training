package com.jiangren.javaee.repositories;

import com.jiangren.javaee.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.Collection;

/**
 * Created by seabookchen on 28/08/2017.
 */
@RepositoryRestController
public interface CourseRepository extends JpaRepository<Course, Long> {

    // select * from book where name = :name
    Collection<Course> findByName(@Param("name") String name);
}
