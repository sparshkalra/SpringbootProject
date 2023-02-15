package com.example.dsa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.dsa.pojo.Request;

public class DsaServiceTest 
{
	@Mock
	Request req;

	@InjectMocks
	DsaServiceI dsaService;
	
	
	@BeforeEach
	public void setup()
	{
		MockitoAnnotations.initMocks(this);

		req.setId("mock");
		req.setName("mock");
	}
	
	@Test
	public void createUserPositiveCase(Request req)
	{
		assertEquals(dsaService.createUserDetails(req), true);
	}
	
	@Test
	public void updateUserPositiveCase(Request req)
	{
		assertEquals(dsaService.updateUserDetails(req), true);
	}
	@Test
	public void updateUserNegativeCase(Request req)
	{
		req.setId("");
		assertEquals(dsaService.updateUserDetails(req), false);
	}

}
