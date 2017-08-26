package com.jiangren.javaee.datas;

import com.jiangren.javaee.models.Category;
import com.jiangren.javaee.models.Course;
import com.jiangren.javaee.models.Instructor;

import java.util.*;

/**
 * Created by seabookchen on 22/08/2017.
 */
public class CourseMockData {

    private static Set<Course> courses = new HashSet<Course>();

    public static Course createCourse(Course course) {
        course.setId(IdGenerator.getId(CourseMockData.class));
        courses.add(course);
        return course;
    }

    public static Set<Course> getAllCourses() {
        return courses;
    }

    public static Course updateCourse(long id, Course course) {
        Course found = courses.stream().filter(_course -> _course.getId().equals(id)).findFirst().get();
        found.setName(course.getName());
        found.setDescription(course.getDescription());

        return found;
    }

    public static Course deleteCourse(long id) {
        Course course = new Course();
        course.setId(id);

        courses.remove(course);

        return course;
    }


    public static Course getCourse(Long id) {
        return courses.stream().filter(course -> id.equals(course.getId())).findFirst().get();
    }
}
