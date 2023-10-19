package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Courses;

@Service
public class CourseServiceImp implements CourseService{

	List<Courses> list;
	
	public CourseServiceImp() {
	 list=new ArrayList();
		list.add(new Courses(1,"Java","Java is a Simple language."));
		list.add(new Courses(2,"Spring Boot","spring boot project."));
	}
	
	
	
	
	
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}






	@Override
	public Courses getCourses(long id) {
		// TODO Auto-generated method stub
		Courses c=null;
		for(Courses co:list) {
		if(co.getId()==id) {	
			c=co;
			break;
		}
		}
		return c;
	}

}
