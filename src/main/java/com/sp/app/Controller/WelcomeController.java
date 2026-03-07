package com.sp.app.Controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.app.Model.Student;

@RestController
public class WelcomeController {
	
	@RequestMapping(value = "/Welcome")
	public String getWelcomeMsg() {
		System.out.println("In Controler Layer");
		String msg = "Welcome to Spring Boot REST-API";
		return msg;
	}
	
	
	
	
	@RequestMapping(value = "/Student")
	public Student getStudent(){
		Student stu = new Student(10, "saurabh", "kolhapur", 85.20f);
		return stu;
	}
	
	
	@RequestMapping(value = "/Students")
	public List<Student> getStudents(){
		
		Student stu1 = new Student(10, "saurabh", "kolhapur", 85.20f);
		Student stu2 = new Student(11, "saurabh", "kolhapur", 85.20f);
		Student stu3 = new Student(12, "saurabh", "kolhapur", 85.20f);
		Student stu4 = new Student(13, "saurabh", "kolhapur", 85.20f);
		Student stu5 = new Student(14, "saurabh", "kolhapur", 85.20f);
		
		List<Student> list = Arrays.asList(stu1, stu2, stu3, stu4, stu5);
		return list;
	}
	
	
}
