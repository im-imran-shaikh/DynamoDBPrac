package com.imran.dynamodb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imran.dynamodb.dao.StudentRepository;
import com.imran.dynamodb.dto.Student;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class StudentController
{
	private final StudentRepository studentRepository;
	
	@PostMapping(path = "addStudent")
	private String addStudent(@RequestBody Student student)
	{
		return studentRepository.addStdent(student);
	}
	
	@GetMapping(path = "/getStudent")
	private Student getOneStudent(@RequestParam String id, @RequestParam String lastname)
	{
		return studentRepository.getOneStudent(id, lastname);
	}
	
	@DeleteMapping(path = "delete")
	private Student delete(@RequestParam String id, @RequestParam String lastname)
	{
		return studentRepository.deleteStudent(id, lastname);
	}
	
	@PutMapping(path = "/updateStudent")
	private String updateStudent(@RequestBody Student student)
	{
		return studentRepository.updateStudent(student);
	}
}
