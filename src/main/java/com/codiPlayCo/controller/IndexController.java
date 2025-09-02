package com.codiPlayCo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexController {

	@GetMapping("/cursos")
	public String cursos() {
		return "cursos";
	}

}
