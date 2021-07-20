package com.gencjuly2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerMsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerMsExampleApplication.class, args);
	}

	@GetMapping("/hello")
	public String welcome()
	{
		return "Weclome to docker tutorial";
	}
	
	
	@GetMapping("/hello/{name}")
	public String welcome(@PathVariable String name)
	{
		return name+"    Weclome to docker tutorial";
	}
}
