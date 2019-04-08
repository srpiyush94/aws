package com.web.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("api")
public class RestController {
	
	//Sample Application 
	
	@GetMapping("/v1")
	public String testAPI()
	{
		return "<h2>Welcome to AWS Deployement using Code pipeline!!</h2>";
	}

}
