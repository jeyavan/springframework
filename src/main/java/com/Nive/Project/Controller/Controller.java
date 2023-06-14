package com.Nive.Project.Controller;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nive.Project.BusinessService.BusinessService;

@RestController
public class Controller {
	@Autowired
	private BusinessService buss;
	@GetMapping("/p")
	public LinkedList<Integer> add() {
		return buss.service();
	}

}
