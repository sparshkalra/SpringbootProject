package com.example.dsa.service;

import org.springframework.stereotype.Component;

import com.example.dsa.pojo.Request;

@Component
public interface DsaServiceI {
	
	public Boolean updateUserDetails(Request req);
	
	public Boolean createUserDetails(Request req);

}
