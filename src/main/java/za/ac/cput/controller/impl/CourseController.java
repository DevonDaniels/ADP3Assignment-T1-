package za.ac.cput.controller.impl;

/*
 * CourseController.java
 * Controller for the Course service
 * Author: Mathew Fortuin (219069514)
 * Date: 4 October 2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Course;
import za.ac.cput.service.impl.CourseService;

import java.util.Set;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    //Create course
    @RequestMapping(value ="/create",method = RequestMethod.POST)
    public Course create(@RequestBody Course course)
    {
        return courseService.create(course);
    }

    //Read course
    @GetMapping("/read/{id}")
    public Course read(@PathVariable String id)
    {
        return courseService.read(id);
    }

    //Update course
    @PostMapping("/update")
    public Course update(@RequestBody Course course)
    {
        return courseService.update(course);
    }

    //Delete course
    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable String id)
    {
        return courseService.delete(id);
    }

    //getAll
    public Set<Course> getAll() {return courseService.getAll();}
}
