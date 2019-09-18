package io.jctiru.springrestsandbox.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jctiru.springrestsandbox.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> studentList;

	@PostConstruct
	public void loadData() {
		studentList = new ArrayList<>();
		studentList.add(new Student("Michael", "Jordan"));
		studentList.add(new Student("Magic", "Johnson"));
		studentList.add(new Student("Larry", "Bird"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentList;
	}

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		return studentList.get(studentId);
	}

}
