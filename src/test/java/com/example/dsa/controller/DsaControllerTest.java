package com.example.dsa.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.dsa.pojo.Request;
import com.example.dsa.service.DsaServiceI;
import com.example.dsa.service.DsaServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class DsaControllerTest 
{
	String id;
	String name;

	@Mock
	Request req;
	
	@Mock
	DsaServiceImpl dsaService;
	
	@InjectMocks
	DsaController controller;
	
	@BeforeEach
	public void setup()
	{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testCreateUserAPIPositiveCase()
	{
		when(dsaService.createUserDetails(req)).thenReturn(true);
		
		String res = controller.createUserDetails(req);
		
		assertEquals(res, "Success");
	}
	
	@Test
	public void testCreateUserAPINegativeCase()
	{
		when(dsaService.createUserDetails(req)).thenReturn(false);
		
		String res = controller.createUserDetails(req);
		
		assertEquals(res, "Failure");
	}
}
