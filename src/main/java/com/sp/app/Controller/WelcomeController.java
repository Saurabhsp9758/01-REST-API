package com.sp.app.Controller;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sp.app.Model.Student;

@RestController
public class WelcomeController {
	
	@GetMapping(value = "/Welcome")
	public String getWelcomeMsg() {
		System.out.println("In Controler Layer");
		String msg = "Welcome to Spring Boot REST-API";
		return msg;
	}
	
	
	@GetMapping(value = "/student")
	public Student getStudent(){
		Student stu = new Student(10, "saurabh", "kolhapur", 85.20f);
		return stu;
	}
	
	
	@GetMapping(value = "/students")
	public List<Student> getStudents(){
		
		Student stu1 = new Student(10, "saurabh", "kolhapur", 85.20f);
		Student stu2 = new Student(11, "saurabh", "kolhapur", 85.20f);
		Student stu3 = new Student(12, "saurabh", "kolhapur", 85.20f);
		Student stu4 = new Student(13, "saurabh", "kolhapur", 85.20f);
		Student stu5 = new Student(14, "saurabh", "kolhapur", 85.20f);
		
		List<Student> list = Arrays.asList(stu1, stu2, stu3, stu4, stu5);
		return list;
	}
	
	
	@PostMapping(value = "/student")
	public String addStudent(@RequestBody Student student)
	{
		System.out.println("Student RollNo :" + student.getRollno());
		System.out.println("Student Name :" + student.getName());
		System.out.println("Student Address :" + student.getAddress());
		System.out.println("Student Marks :" + student.getMarks());
		
		return "Records Added Successfully";	
	}
	
	
	// Path Parameter
	
	@GetMapping(value = "/checkEvenOdd/{num}")
	public String checkNumber(@PathVariable int num)
	{
		String msg = (num % 2 == 0) ? "Even Number: " + num : "Odd Number: " + num;
		return msg;	
	}
	
	
	// Query Parameter
	
	@GetMapping(value = "/login")
	public String checkLogin(@RequestParam String userName, @RequestParam String password)
	{
	   System.out.println("User Name :" + userName);
	   System.out.println("Password :" + password);
	   return "Login Successfully";
	}
	
}
