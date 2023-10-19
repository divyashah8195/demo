package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Courses;
import com.example.demo.service.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService service;

	@GetMapping("/home")
	public String home() {
		return "Welcome to your Application";
	}

	// get courses
	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return this.service.getCourses();
	}

	@GetMapping("/courses/{courseId}")
	public Courses getCoursesById(@PathVariable long courseId) {
		return this.service.getCourses(courseId);
	}
}
