package com;

import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;


@SuppressWarnings("unused")
public class Hello {
	
	public String hello() 
	 { 
	 return "Hello world."; 
	 } 

}
