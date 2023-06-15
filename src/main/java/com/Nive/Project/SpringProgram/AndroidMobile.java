package com.Nive.Project.SpringProgram;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AndroidMobile implements MobileConsole {
String s="Welcome";


@Override
public void mesage() {
	int message=25;
	System.out.println(s);
	int i=4;
	
	
	if(message<=5) {
		System.out.println("your message has been successfully sent");
		System.out.println("Thank you for using AndroidPhone");
		
	}
		
		else if(message>5) {
			System.out.println("You can sent message only five group");
			
			}
	while(i<=4) {
		for(i=0;i<=4;i++) {
		System.out.println(i);
			
			
			}
	}
	System.out.println("please try again");	

}

	}

