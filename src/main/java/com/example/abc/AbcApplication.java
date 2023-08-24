package com.example.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class AbcApplication {
	@RequestMapping("hello")
	public String fun()
	{
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(AbcApplication.class, args);
	}

}
