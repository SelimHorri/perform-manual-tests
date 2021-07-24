package com.selimhorri.pack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;

@Configuration
public class ObjectMapperBeanConfig {
	
	@Bean
	public ObjectMapper getObjectMapper() {
		return new JsonMapper()
				.configure(SerializationFeature.INDENT_OUTPUT, true);
	}
	
	
	
}
