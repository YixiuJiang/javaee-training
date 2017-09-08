package com.jiangren.javaee.repositories;

import com.jiangren.javaee.models.Course;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by seabookchen on 2/09/2017.
 */
public class CourseDao {

    @PersistenceContext
    private EntityManager em;

    public void createCourse(Course course) {
        em.persist(course);
    }

    public Course findCourse(Long id) {
        return em.find(Course.class, id);
    }
}
