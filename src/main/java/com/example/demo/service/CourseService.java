package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Courses;


public interface CourseService {
	
	public List<Courses> getCourses();
	
public Courses getCourses(long id);
	
}
