package com.mindtree.oauth2.main.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
//comment
	@RequestMapping("user")
    @ResponseBody
    public Principal user(Principal principal) {
        return principal;
    }
	
	@RequestMapping("/index")
	public String homePage() {
		System.out.println("hi");
		return "index";
	}
}
