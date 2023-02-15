package com.example.dsa.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.dsa.pojo.Request;

@Component
public class DsaServiceImpl implements DsaServiceI 
{
	Map<String,String> hm = new HashMap<String, String>();
	
	
	@Override
	public Boolean updateUserDetails(Request req)
	{
		if(hm.containsKey(req.getId()))
		{
			hm.put(req.getId(), req.getName());
			
			return true;
		}
		return false;
	}

	@Override
	public Boolean createUserDetails(Request req) 
	{
		hm.put(req.getId(), req.getName());
		return true;
	}
}
