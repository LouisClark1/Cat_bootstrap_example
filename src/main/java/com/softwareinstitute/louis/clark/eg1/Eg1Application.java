package com.softwareinstitute.louis.clark.eg1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // i dont know why we need this
public class Eg1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eg1Application.class, args);
	}
	@GetMapping("/getcat")
	public String catResponse(){
		Cat cat = new Cat("billy", 7, "Dirty");
	return cat.getJsonObjectCat();
	}
}
