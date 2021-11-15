package com.Student.services;

import java.util.List;

import com.Student.Entities.Student;

public interface StudentServices {
	
	List<Student> getAllStudents();
	void SaveStudentDetails(Student student);
	
	Student getStudentByID(int id);
	
	void StudentDeleteById(int id);

}
