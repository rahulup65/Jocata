package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entites.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		
		Integer i=(Integer)this.hibernateTemplate.save(student);
		return i;
	}

	//get the single object(data)
	
	public Student getStudent(int studentId) {
		
		
		Student student=this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	
	// get all the student 
	
	public List<Student> getAllStudents(){
		
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	// delete the data
	
	@Transactional
	public void delete(int studentId) {
		
		Student student=this.hibernateTemplate.get(Student.class, studentId);// first find the object then delete that 
		this.hibernateTemplate.delete(student);// it will not return anyhting
		
	}
	
	//update the data
	@Transactional
	public void updateStudent(Student student) {
		
		
		
		this.hibernateTemplate.update(student);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
