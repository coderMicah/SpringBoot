package com.Micah.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public Course[] RetrieveAllCourses(){
		return new Course[] {
			    new Course(1,"Learn AWS","Udemy"),
			    new Course(2,"Learn Spring & Spring Boot 3","Udemy")
			  };
	}
}
