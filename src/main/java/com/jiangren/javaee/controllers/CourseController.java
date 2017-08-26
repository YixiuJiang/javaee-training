package com.jiangren.javaee.controllers;

import com.jiangren.javaee.datas.CourseMockData;
import com.jiangren.javaee.models.Course;
import org.springframework.http.CacheControl;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by seabookchen on 22/08/2017.
 */
@RestController
@RequestMapping("/ols/api/v1/")
public class CourseController {

    @RequestMapping(value = "courses", method = RequestMethod.GET)
    public Set<Course> list() {

        /*
        String headerValue = CacheControl.maxAge(10, TimeUnit.SECONDS).getHeaderValue();
        response.addHeader("Cache-Control", headerValue);
        */

        return CourseMockData.getAllCourses();
    }

    @RequestMapping(value = "course", method = RequestMethod.POST)
    public Course create(@RequestBody Course course) {
        return CourseMockData.createCourse(course);
    }

    @RequestMapping(value = "course/{id}", method = RequestMethod.GET)
    public Course get(@PathVariable Long id) {
        return CourseMockData.getCourse(id);
    }

    @RequestMapping(value = "course/{id}", method = RequestMethod.PUT)
    public Course update(@PathVariable Long id, @RequestBody Course course) {
        return CourseMockData.updateCourse(id, course);
    }

    @RequestMapping(value = "course/{id}", method = RequestMethod.DELETE)
    public Course delete(@PathVariable Long id) {
        return CourseMockData.deleteCourse(id);
    }
}
