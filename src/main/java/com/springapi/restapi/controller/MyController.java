package com.springapi.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springapi.restapi.entities.Courses;
import com.springapi.restapi.services.CourseService;

@RestController
@RequestMapping("api/")
public class MyController {
	
	@Autowired
	private CourseService courseService;
	RestTemplate restTemplate;
	
	@GetMapping("/home")
	public String home(){
		return "this is controller method";
		
	}
	
	//get the courses
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return this.courseService.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Courses addCourses(@RequestBody Courses course) {
		return this.courseService.addCourse(course); 
	}
	
	
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses course) {
		return this.courseService.updateCourse(course); 
	}

}

