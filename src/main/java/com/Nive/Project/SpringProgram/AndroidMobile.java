package com.Nive.Project.SpringProgram;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AndroidMobile implements MobileConsole {
String s="Welcome";


@Override
public void mesage() {
	int message=10;
	System.out.println(s);
	
	if(message<=5) {
		System.out.println("your message has been successfully sent");
		System.out.println("Thank you for using Android");
		
	}
		
		else if(message>5) {
			System.out.println("You can send message only for five groups");
			System.out.println("But you sent more than five groups");
			while(message>5) {
				for(message=0;message<=6;message++) {
				System.out.println("Group: "+message);
					
					}
				System.out.println("Pleas try again");
				break;
			}
			
			
			}
	

}

	}

