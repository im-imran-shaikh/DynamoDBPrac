package com.imran.dynamodb.dao;

import java.util.Objects;

import org.springframework.stereotype.Component;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.imran.dynamodb.dto.Student;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class StudentRepositoryImpl implements StudentRepository
{

	private final DynamoDBMapper mapper;
	
	@Override
	public String addStdent(Student student)
	{
		Objects.requireNonNull(student, "Student object can't be null");
		mapper.save(student);
		return "Student added sucessfully";
	}

	@Override
	public Student deleteStudent(String id, String lastname)
	{
		Student student = getOneStudent(id, lastname);
		mapper.delete(student);
		return student;
	}

	@Override
	public Student getOneStudent(String id, String lastname)
	{
		Student student = mapper.load(Student.class, id, lastname);
		Objects.requireNonNull(student, "Student id is not exist");
		return student;
	}

	@Override
	public String updateStudent(Student student)
	{
		Student oldStudentAttribute = mapper.load(Student.class, student.getId());
		Objects.requireNonNull(oldStudentAttribute, "old student attribute doesn't exist");
		mapper.save(student);
		return "Student updated";
	}

}
