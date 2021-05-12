package com.subbu.json_to_XML;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
@Controller
@SpringBootApplication
public class App 
{
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
	
	@RequestMapping("/")
	String index() {
		return "index";
	}
}
