package com.revoltcode.springboot.demo.mycoolapp;

//This is a special class that Bootstraps our Spring Boot Application
import org.springframework.boot.SpringApplication;

/*
 * The below import statement below imports a class that composes of 3 annotations for proper Spring configuration
 *  
 *  Note: @SpringBootApplication therefore contains
 *   - @EnableAutoConfiguration
 *   - @ComponentScan
 *   - @Configuration
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		
		/*
		 * Note: Behind the scenes the following happens
		 * 
		 *  - Creates application context and registers all beans
		 *  - Starts the Embedded server: Tomcat etc..
		 */
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
