package com.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student.Entities.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
