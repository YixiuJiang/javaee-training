package com.jiangren.javaee.datas;

import com.jiangren.javaee.models.Category;
import com.jiangren.javaee.models.Course;
import com.jiangren.javaee.models.Instructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by seabookchen on 22/08/2017.
 */
public class MockData {

    private static List<Course> courseList = new ArrayList<Course>();
    private static List<Category> categories = new ArrayList<Category>();
    private static List<Instructor> instructors = new ArrayList<Instructor>();


    static {
        Instructor seabook = new Instructor();
        seabook.setId(001l);
        seabook.setFirstName("seabook");
        seabook.setLastName("chen");
        seabook.setAvartaUrl("http://img1.jurko.net/avatar_4876.jpg");
        seabook.setBio("I am a good java teacher.");
        seabook.setLinkedInProfileUrl("https://www.linkedin.com/in/seabookchen/");


        Instructor lightman = new Instructor();
        lightman.setId(002l);
        lightman.setFirstName("lightman");
        lightman.setLastName("wang");
        lightman.setAvartaUrl("http://img1.jurko.net/avatar_18155.jpg");
        lightman.setBio("I am a good front end developer.");
        lightman.setLinkedInProfileUrl("https://www.linkedin.com/in/lightman-yanbo-wang-4b013444");

        Category category = new Category();
        category.setId(001l);
        category.setName("Programming");
        category.setDescription("This is all about programming courses");


        Course javaCourse = new Course();
        javaCourse.setId(001l);
        javaCourse.setName("Java 101");
        javaCourse.setDescription("This is a core Java course.");
        javaCourse.setInstructor(seabook);
        javaCourse.setCategoryList(Arrays.asList(category));

        Course jsCourse = new Course();
        jsCourse.setId(002l);
        jsCourse.setName("Javascript 101");
        jsCourse.setDescription("This is a Javascript course.");
        jsCourse.setInstructor(seabook);
        jsCourse.setCategoryList(Arrays.asList(category));

        Course htmlCourse = new Course();
        htmlCourse.setId(003l);
        htmlCourse.setName("Html 101");
        htmlCourse.setDescription("This is a Html5 Course.");
        htmlCourse.setInstructor(lightman);
        htmlCourse.setCategoryList(Arrays.asList(category));

        // setup relationships
        category.setCourseList(Arrays.asList(javaCourse, jsCourse, htmlCourse));
        seabook.setCourses(Arrays.asList(javaCourse, jsCourse));
        lightman.setCourses(Arrays.asList(htmlCourse));

        // build list
        instructors.addAll(Arrays.asList(seabook, lightman));
        //courseList.addAll(Arrays.asList(javaCourse, jsCourse, htmlCourse));
        //categories.addAll(Arrays.asList(category));

    }


    public static List<Instructor> getInstructors() { return instructors; }

    public static Optional<Instructor> getInstructorById(Long id) {
        return instructors.stream().filter(instructor -> instructor.getId() == id).findFirst();
    }

    public static List<Course> getCourses() { return courseList; }
    public static List<Category> getCategories() { return categories; }


}
