package com.Nive.Project.SpringProgram;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AndroidMobile implements MobileConsole {
String s="Welcome";


@Override
public void mesage() {
	int message=20;
	System.out.println(s);
	//int i=4;
	
	
	if(message<=5) {
		System.out.println("your message has been successfully sent");
		System.out.println("Thank you for using Android");
		
	}
		
		else if(message>5) {
			System.out.println("You can send message only five group: Try again");
			while(message>5) {
				for(message=0;message<=4;message++) {
				System.out.println("Group: "+message);
					
					}
				
			}
			
			
			}
	

}

	}

