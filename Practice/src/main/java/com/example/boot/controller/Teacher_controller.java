package com.example.boot.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

import com.example.boot.entities.Student;
import com.example.boot.exception.StudentNotFoundException;
import com.example.boot.repositories.StudentRepository;
import com.example.boot.services.*;
import java.util.*;
@RestController
public class Teacher_controller {
	 //System.out.println("outside method");
	 
	//Autowired service class
	@Autowired
	 StudentService studentservice;
	
     //GET
	@RequestMapping("/student")
	public @ResponseBody List<Student> Getstudent() {
		System.out.println("inside method");
		return studentservice.Getallstudent();
	}
	
	//POST
	@RequestMapping("/poststudent")
	@ResponseBody
	public Student poststudent(@RequestBody Student ss) {
		System.out.println("create student method");
		return studentservice.create_student(ss);
		
	}
	
	
	@RequestMapping("/students/{id}")
	public Optional<Student> getbyid(@PathVariable("id") int id){
		System.out.println("getstudent by id");
		try {
			return studentservice.getbyid(id);
		}
		catch(StudentNotFoundException e){                //Student not found exception is catched here
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
		}
		//System.out.println("getstudent by id");
		//return studentservice.getbyid(id);
	}
	
	
	@RequestMapping("/updatestudent/{id}")
	public Student updateid(@PathVariable("id") int id, @RequestBody Student stu) {
		System.out.println("updatestudent by id");
		return studentservice.updatebyid(id, stu);
	}
	
	
	@RequestMapping("/updatestudent/{lname}")
	public Student updatelname(@PathVariable("lname") String lname, @RequestBody Student stu) {
		System.out.println("updatestudent by lname");
		return studentservice.updatebylname(lname, stu);
	}
	
	
	
	@RequestMapping("/deletestudent/{id}")
	public void deleteid(@PathVariable("id") int id) {
		System.out.println("deletestudent by id");
		 studentservice.deletebyid(id);
	}
}

//@RestController
//@RequestMapping("/student")
//public class Stu_controller {
//	
//	//Autowired service class
//	@Autowired
//	 StudentRepository studentrepo;
//	@RequestMapping("/update")
//	public @ResponseBody void update() {
//		System.out.println("inside update method");
//		Student stu=new Student("xxx","yyy",60,70,105);
//		studentrepo.save(stu);
//	}
//	
//}
