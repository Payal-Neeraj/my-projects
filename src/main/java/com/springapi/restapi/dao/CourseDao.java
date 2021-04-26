package com.springapi.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapi.restapi.entities.Courses;

public interface CourseDao extends JpaRepository<Courses, Long> {

}
