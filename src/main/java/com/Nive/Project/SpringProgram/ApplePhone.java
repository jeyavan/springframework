package com.Nive.Project.SpringProgram;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class ApplePhone implements MobileConsole {
int message=20;

	
@Override
	public void mesage() {
	System.out.println("Welcome");
		if(message<=10) {
			
			System.out.println("your message has been successfully sent");
			System.out.println("Thank you for using ApplePhone");
		}
			
			else if(message>10) {
				System.out.println("You can sent message only ten groups");
				System.out.println("please try again");
				
				
			}
		
			
		
	}

}
