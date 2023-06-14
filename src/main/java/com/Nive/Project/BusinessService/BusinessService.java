package com.Nive.Project.BusinessService;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Nive.Project.DataService.DataService;

@Component
public class BusinessService {
	@Autowired
	private DataService data;
	public LinkedList<Integer> service(){
		LinkedList<Integer> el=new LinkedList<Integer>();
		el.add(10);
		el.add(12);
		el.addAll(el);
		el.remove(1);
		System.out.println("Remove value: 12"+el);
		return data.data();
		
	
	}

}
