package com.imran.dynamodb.dto;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@DynamoDBDocument
public class Address
{
	@DynamoDBAttribute
	private String city;
	
	@DynamoDBAttribute
	private int zipCode;
	
	@DynamoDBAttribute
	private String state;
	
	@DynamoDBAttribute
	private String country;
}
