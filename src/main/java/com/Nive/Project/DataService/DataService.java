package com.Nive.Project.DataService;

import java.util.LinkedList;

import org.springframework.stereotype.Component;

@Component
public class DataService {
	public LinkedList<Integer> data(){
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(20);
		li.add(90);
		li.add(12);
		System.out.println(li);
		System.out.println("AddFirst:100 ");
		li.addFirst(100);
		li.getFirst();
		System.out.println(li);
		System.out.println("AddLast:200 ");
		li.addLast(200);
		li.getLast();
		System.out.println(li);
		
		li.descendingIterator();
		System.out.println("DescendingIterator: "+li);
		
	
		return li;
	}

}
