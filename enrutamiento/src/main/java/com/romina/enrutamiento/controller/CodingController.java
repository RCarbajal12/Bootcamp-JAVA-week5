package com.romina.enrutamiento.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	
	@RequestMapping("/coding")
	public String saludo() {
		return "¡Hola Coding Dojo!";
	}
	@RequestMapping("/coding/python")
	public String hola() {
		return "¡Python/Django fue increíble!";
	}
	@RequestMapping("/coding/java")
	public String bienvenida() {
		return "¡Java/Spring es mejor!";
	}

}
