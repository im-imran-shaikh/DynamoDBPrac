package com.imran.dynamodb.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("aws")
@PropertySource("aws.properties")
@Getter
@Setter
@Component
public class AwsCredentials
{
	private String accessKey;
	private String secretKey;
	private String region;
	private String endpoint;
}
