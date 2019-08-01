package edu.mum.cs.cs425.demos.eRegistra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = {"/","/eregistra/","eregistra/home"})
	public String displayHomepage() {
		return "home/index";
	}

}
