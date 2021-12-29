package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(int studentId);
	
	//getting the one object from the database
	
	public Student getStudent(int studentId);
	
	//getting all the row or object from the database
	
	public List<Student> getAllStudents();
	
}
