package com.Nive.Project.SpringProgram;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AndroidMobile implements MobileConsole {
String s="Welcome";

@Override
public void mesage() {
	int message=5;
	System.out.println(s);
	
	if(message<=5) {
		System.out.println("your message has been successfully sent");
		System.out.println("Thank you for using AndroidPhone");
		
	}
		
		else if(message>5) {
			System.out.println("You can sent message only five group");
			System.out.println("please try again");
			
			
		}
		
			
		}
}
