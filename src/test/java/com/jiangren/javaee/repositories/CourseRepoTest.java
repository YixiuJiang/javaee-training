package com.jiangren.javaee.repositories;

import com.jiangren.javaee.models.Category;
import com.jiangren.javaee.models.Course;
import com.jiangren.javaee.models.Instructor;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by seabookchen on 3/09/2017.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@TestPropertySource(locations="classpath:test.properties")
public class CourseRepoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CourseRepository courseRepository;

    public Course prepareTestData() {
        Course course = new Course();
        course.setName("Test Course");
        course.setDescription("This is a test course");


        Instructor instructor = new Instructor();
        instructor.setFirstName("Seabook");
        instructor.setLastName("Chen");
        instructor.setLinkedInProfileUrl("linkedin");
        instructor.setBio("This is the bio");

        Category category = new Category();
        category.setName("Test Category");
        category.setDescription("Category Desc");


        course.setInstructor(instructor);
        Set categories = new HashSet<Category>();
        categories.add(category);
        course.setCategories(categories);

        return course;
    }

    @After
    public void clear() {
        courseRepository.deleteAll();
    }

    @Test
    public void testFindByName() {
        Course course = prepareTestData();

        this.entityManager.persist(course);
        Collection<Course> foundCourses = this.courseRepository.findByName("Test Course");

        assertThat(foundCourses.size()).isEqualTo(1);
        assertThat(foundCourses).extracting("name").contains("Test Course");
    }

    @Test
    public void testFindInstructor() {
        Course course = prepareTestData();

        Course persist = this.entityManager.persistFlushFind(course);
        Instructor instructor = persist.getInstructor();

        assertThat(instructor.getFirstName()).isEqualTo("Seabook");
        assertThat(instructor.getLastName()).isEqualTo("Chen");

    }

    @Test
    public void testFindCategories() {
        Course course = prepareTestData();

        Course persist = this.entityManager.persistFlushFind(course);
        Set<Category> categories = persist.getCategories();

        assertThat(categories.size()).isEqualTo(1);
        assertThat(categories).extracting("name").contains("Test Category");

    }

    @Test
    public void testCourse2String() {
        Course course = prepareTestData();
        System.out.println(course);
    }
}
