package az.kitab.Kitabxana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")

public class UserController {
	
	@GetMapping(path = "/login")
	public void login() {
		
	}

}
