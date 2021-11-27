package com.mallon.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class ExampleRESTEndpoint {
	
	// Build a repo and load some fake data into it.
	private List<TransferObject> repository = new ArrayList<>();


	@CrossOrigin
	@RequestMapping(method = {RequestMethod.POST}, path="/example") 
	public @ResponseBody List<TransferObject> examplePOSTEndpoint(@RequestBody TransferObject sentIn) {
		
		System.out.println("POST /example received with object: " + sentIn);
		this.repository.add(sentIn);
		
		return repository;
	}
	
	@GetMapping("/hello")
	public @ResponseBody String sayHello() {
	  return "This is a hello from mickey! Heroku automatic build done";
	}

//	@GetMapping("")
	
	@CrossOrigin
	@RequestMapping(method = {RequestMethod.GET}, path="/example") 
	public @ResponseBody List<TransferObject> exampleGETEndpoint() {
		
		System.out.println("GET /example requested, sending list: " + this.repository);
		
		return this.repository;
	}



}
