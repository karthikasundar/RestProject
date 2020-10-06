package com.example.boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.boot.repositories.StudentRepository;

import java.util.*;

import com.example.boot.entities.Student;
import com.example.boot.exception.StudentNotFoundException;

//service
@Service
public class StudentService {
	
	//autowired the StudentRepo
	@Autowired
	 StudentRepository studentrepository;
    
	//GET
	public List<Student> Getallstudent(){
		return studentrepository.findAll();
	}
	
	//Post
	public  Student create_student(Student ss) {
		return studentrepository.save(ss);
	}
	
	//GETBYID
	//GETBYID
		public Optional<Student> getbyid(int id) throws StudentNotFoundException{
			Optional<Student> stu=studentrepository.findById(id);
			if(!stu.isPresent()) {
				throw new StudentNotFoundException("The requested id is not there");
			}
			return stu;
		}
	//update by id
		public Student updatebyid(int id, Student stu) {
			stu.setId(id);
			return studentrepository.save(stu);
			
		}
		
		//update by lname
		public Student updatebylname(String lname, Student stu) {
			stu.setLname(lname);
			return studentrepository.save(stu);
			
		}
		
		
		public void deletebyid(int id) {
			if(studentrepository.findById(id).isPresent()) {
				studentrepository.deleteById(id);
			}
		}
}
