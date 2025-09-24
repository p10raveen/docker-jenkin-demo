package com.wipro.jenkin.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/api/v1/jenkin")
@RestController
public class JenkinController {

	@GetMapping
	public String showJenkinPipeline()
	{
		return "Welcome to Jenkin Pipeline!";
	}
}
