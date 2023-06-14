package com.Nive.Project.SpringProgram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	private  MobileConsole mc;
	
	public void run() {
	System.out.println("Thank you for using Anroid");	
		
		
	}
	public void disp() {
		mc.mesage();
	}
	

}
