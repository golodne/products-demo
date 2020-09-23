package com.example.productsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ProductsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/test")
class ProductsController {

	@GetMapping
	public String getProducts() {
		return "test products success";
	}
}
