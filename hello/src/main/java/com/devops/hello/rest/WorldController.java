package com.devops.hello.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devops.hello.dto.HelloWorldResponse;

@RestController
@RequestMapping("/world")
public class WorldController {

	@Value("${env.name}")
	private String env;
	
	@RequestMapping("/hello")
	public HelloWorldResponse hello() {
		HelloWorldResponse response = new HelloWorldResponse();
		response.setResponse("Hello World " + env);
		
		return response;
	}
}
