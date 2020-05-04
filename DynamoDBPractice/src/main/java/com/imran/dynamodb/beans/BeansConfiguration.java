package com.imran.dynamodb.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.imran.dynamodb.dao.StudentRepository;
import com.imran.dynamodb.dao.StudentRepositoryImpl;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class BeansConfiguration
{
	private final DynamoDBMapper mapper;
	
	@Bean
	public StudentRepository studentRepository()
	{
		return new StudentRepositoryImpl(mapper);
	}
}
