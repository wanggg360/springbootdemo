package com.wg.springboot.service;


import org.testng.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import static org.testng.Assert.assertTrue;


@SpringBootTest
public class UserServiceTest extends AbstractTestNGSpringContextTests{
	
	@Autowired
	UserService userService;
	
	@BeforeClass
	
	public void beforeClass()
	{
		System.out.println("#### the before class ####");
	}
	
	@Test
	public void testHasMatchCount()
	{
		boolean b=userService.hasMatchUser("admin", "123456");
		
		assertTrue(b);
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("#### the after class ####");
	}
	

}
