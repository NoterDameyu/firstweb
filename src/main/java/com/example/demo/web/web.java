package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



	@RestController
	public class web {
		@GetMapping("/")
		public String index() {
			return "王浩宇";
		}
	}

