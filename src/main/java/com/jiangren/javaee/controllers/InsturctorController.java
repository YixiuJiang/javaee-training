package com.jiangren.javaee.controllers;

import com.jiangren.javaee.datas.MockData;
import com.jiangren.javaee.models.Category;
import com.jiangren.javaee.models.Instructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.jiangren.javaee.datas.MockData.getInstructorById;
import static com.jiangren.javaee.datas.MockData.getInstructors;

/**
 * Created by seabookchen on 22/08/2017.
 */
@RestController
@RequestMapping("api/v1/")
public class InsturctorController {


    @RequestMapping(value = "instructors", method = RequestMethod.GET)
    public List<Instructor> list() {
        return getInstructors();
    }

    /*
    @RequestMapping(value = "instructors", method = RequestMethod.POST)
    public Instructor create(@RequestBody Instructor instructor) {
        return ShipwreckStub.create(instructor);
    }

    @RequestMapping(value = "instructors/{id}", method = RequestMethod.GET)
    public Instructor get(@PathVariable Long id) {
        return getInstructorById(id).isPresent() ? getInstructorById(id).get() : null;
    }

    @RequestMapping(value = "instructors/{id}", method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
        return ShipwreckStub.update(id, shipwreck);
    }

    @RequestMapping(value = "instructors/{id}", method = RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable Long id) {
        return ShipwreckStub.delete(id);
    }
    */
}
