package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {

		@GetMapping("/get-param")
		public String getParam(@RequestParam String greeting,Model model) {
			model.addAttribute("mGreeting", greeting);
			
			return "display";
		}
}
