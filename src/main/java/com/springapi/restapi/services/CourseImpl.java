package com.springapi.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.springapi.restapi.dao.CourseDao;
import com.springapi.restapi.entities.Courses;


@Service
public class CourseImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	//List<Courses> list;
	
	public CourseImpl() {
//		list=new ArrayList<>();
//		list.add(new Courses(143,"Core Java","This course provides basic information about java"));
//		list.add(new Courses(214,"Spring Boot","This course teaches how to create rest API's using spring boot"));
		
		
	}

	@Override
	public List<Courses> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Courses getCourse(long courseId) {
//		Courses c=null;
//		for(Courses course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//			
//			
//		}
		
		return courseDao.getOne(courseId);
	}
	
	@Override
	public Courses addCourse(Courses course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Courses updateCourse(Courses course) {
//		list.forEach(e -> {
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		
		courseDao.save(course);
		return course;
	}
	
//	public void deleteCourses(long parseLong) {
//		Courses entity=courseDao.getOne(parseLong);
//		courseDao.delete(entity);
//	}

	
	

}
