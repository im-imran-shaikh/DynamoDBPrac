package com.imran.dynamodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DynamoDbPracticeApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext beans = SpringApplication.run(DynamoDbPracticeApplication.class, args);
	}

}