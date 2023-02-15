package com.example.dsa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsa.pojo.Request;
import com.example.dsa.service.DsaServiceI;

@RestController
@RequestMapping("/dsa")
public class DsaController 
{
	@Autowired
	DsaServiceI dsaService;
	
	@GetMapping(value = "/health")
	public String checkHealth()
	{
		return "Working";
	}
	
	@GetMapping(value = "/{id}")
	public String getUserDetails(@PathVariable("id") String id)
	{
         
	        //Service call to Get user Data based on id from DB
	        String output ="user details for id "+id+ ": Name:John, state : New jersey,Country:USA, age:45";
	       
	        return output;
	}
	
	@PutMapping(value = "/updateuser")
	public String updateUserDetails(@RequestBody Request req)
	{
         
	        //Service call to Get user Data based on id from DB
	       
		if(dsaService.updateUserDetails(req))
		{
			return "Success";
		}
		return "failure";
	}
	
	@PostMapping(value = "/createuser")
	public String createUserDetails(@RequestBody Request req)
	{
         
	        //Service call to Get user Data based on id from DB
	       
		if(dsaService.createUserDetails(req))
		{
			return "Success";
		}
		return "failure";
	}
	
	@GetMapping("/api")
	public String getFoos(@RequestParam String id) 
	{
	    return "ID: " + id;
	}
}
