package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.example.demo.entities.Course;

public class CourseServiceImpl implements CourseService{

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> findCourseWithSorting(String field) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Course> findCoursesWithPagination(int offSet, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Course> findCoursesWithPaginationAndSorting(int offset, int pageSize, String field) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Course> getCourse(long courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		
	}
	

}
