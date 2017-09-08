package com.collaboration.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collaboration.DAO.BlogDAO;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class BlogDAOTestCase {

	static BlogDAO blogDAO;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
		blogDAO=(BlogDAO)annotationConfigAppContext.getBean("blogDAO");
	}
	
	@Test
	public void test()
	{
		fail("not yet implemented");
	}
	
}