package com.Nive.Project.SpringProgram;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ApplePhone implements MobileConsole {
int message=20;
String s="Welcome";
	
@Override
	public void mesage() {
	System.out.println("Welcome");
		if(message<10) {
			
			System.out.println("your message has been sent");
		}
			
			else if(message>10) {
				System.out.println("You can sent message only ten groups");
				System.out.println("please try again");
				System.out.println("Thank you for using ApplePhone");
				
			}
		
			
		
	}

}
