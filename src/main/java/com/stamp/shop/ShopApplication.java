package com.stamp.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShopApplication {

	@GetMapping("/welcome")
	public String welcome()  {
		return "Hello World";
	}

	@GetMapping("/love")
	public String love() {
		return "I love Java ;)";
	}


	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

}
