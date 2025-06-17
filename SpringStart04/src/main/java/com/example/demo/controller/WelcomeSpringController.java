package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeSpringController {

		@GetMapping("/welcome")
		//HTMLテンプレートにwelcome-spring.htmlを指定
		public String welcome() {
			return "welcome-spring";
		}
}
