package com.Nive.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Nive.Project.SpringProgram.Mobile;
import com.Nive.Project.SpringProgram.MobileConsole;

@SpringBootApplication
public class SpringframeworkApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(SpringframeworkApplication.class, args);
	
	 MobileConsole mc=context.getBean( MobileConsole.class);
	 mc.mesage();
	
	}

}
