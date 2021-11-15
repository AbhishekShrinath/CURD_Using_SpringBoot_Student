package com.Student.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.Entities.Student;
import com.Student.Repository.StudentRepository;

@Service
public class StudentServicesIMPL implements StudentServices {

	@Autowired
	private StudentRepository repository;
	
	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();

	}

	@Override
	public void SaveStudentDetails(Student student) {
		repository.save(student);
}

	@Override
	public Student getStudentByID(int id) {

		Optional<Student> findById = repository.findById(id);
		Student find=findById.get();
		return find;
	}

	@Override
	public void StudentDeleteById(int id) {
			repository.deleteById(id);
		
	}

}
