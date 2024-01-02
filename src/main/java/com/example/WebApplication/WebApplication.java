package com.example.WebApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@SpringBootApplication
@PropertySource(value = "application.properties")
public class WebApplication {

	public static void main(String[] args) {
		 SpringApplication.run(WebApplication.class, args);
	}

}
