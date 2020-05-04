package com.imran.dynamodb.dynamodb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.imran.dynamodb.dto.AwsCredentials;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class DynamoDBConfiguration
{
	private final AwsCredentials awsCredentials;
	
	@Bean
	public DynamoDBMapper dynamoDBMapper()
	{
		System.out.println("Under dynamoDBMapper");
		return new DynamoDBMapper(amazonDynamoDBConfiguration());
	}
	
	private AmazonDynamoDB amazonDynamoDBConfiguration()
	{
		System.out.println("access key = " + awsCredentials.getAccessKey());
		System.out.println("Under amazonDynamoDBConfiguration");
		System.out.println("access key = " + awsCredentials.getAccessKey());
		return AmazonDynamoDBClientBuilder.standard()
				.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(awsCredentials.getEndpoint(),awsCredentials.getRegion()))
				.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(awsCredentials.getAccessKey(), awsCredentials.getSecretKey())))
				.build();
	}
	
}
