package com.example.SpringBootDevTools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@GetMapping(value="/hello")
	public String method() {
		return "sandeep";
	}
}
