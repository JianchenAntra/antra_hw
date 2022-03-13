package com.springboot.first.app;
import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

	// http://localhost:8090/student
	@GetMapping("/student")
	public student getStudent() {
		return new student("Ramesh", "Fadatare");
	}
	
	@GetMapping("/students")
	public List<student> getStudents() {
		List<student> students = new ArrayList<>();
		students.add(new student("Ramesh", "Fadatare"));
		students.add(new student("Aaaa", "jacke"));
		students.add(new student("Coatorj", "hayatare"));
		students.add(new student("Doctors", "wyebisuic"));
		students.add(new student("mark", "tuwenwen"));
		
		return students;
	}
	
	//http://localhost:8090/student/ramesh
}
