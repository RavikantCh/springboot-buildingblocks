package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//URI - /helloWorld
	
	//@RequestMapping(method=RequestMethod.GET, path="/helloWorld")
	@GetMapping("/helloWorld1")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Steve", "Reddy", "Hyd");
		
	}

}
