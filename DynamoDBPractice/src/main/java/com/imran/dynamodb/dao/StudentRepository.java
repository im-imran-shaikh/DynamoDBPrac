package com.imran.dynamodb.dao;

import org.springframework.stereotype.Repository;

import com.imran.dynamodb.dto.Student;

@Repository
public interface StudentRepository
{
	String addStdent(Student student);
	Student deleteStudent(String id, String lastname);
	Student getOneStudent(String id, String lastname);
	String updateStudent(Student student);
}
