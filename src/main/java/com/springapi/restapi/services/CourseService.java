package com.springapi.restapi.services;

import java.util.List;

import com.springapi.restapi.entities.Courses;

public interface CourseService {
	public List<Courses> getCourses();
	public Courses getCourse(long courseId);
	public Courses addCourse(Courses course);
	public Courses updateCourse(Courses course);
	//public void deleteCourses(long parseLong);

}
