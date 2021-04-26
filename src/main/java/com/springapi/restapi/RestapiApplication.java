package com.springapi.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.springapi.restapi.dao.CourseDao;

@SpringBootApplication
public class RestapiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}
	
	@Autowired 
	private CourseDao courseDao; 
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
