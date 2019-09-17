package io.jctiru.springrestsandbox.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jctiru.springrestsandbox.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Michael", "Jordan"));
		studentList.add(new Student("Magic", "Johnson"));
		studentList.add(new Student("Larry", "Bird"));
		return studentList;
	}

}
