package com.romina.holahumanos.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaHumano {
	
	@RequestMapping("")
	public String bienvenida() {
		return "Hello Human! Welcome to Spring Boot";
	}
	@GetMapping("/hoy")
	public String hoy(String test) {
		return "Hoy es un gran día";
	}
	@GetMapping("/manana")
	public String manana(){
		return "Mañana sera un gran dia";
	}
	
	//PARAMETRO DE CONSULTA
	 @RequestMapping("/buscar")
	    public String index(@RequestParam(value="name", required = false) String buscar) {
	        return "Hello " + buscar + " Welcome to Spring Boot ";
	    }
	 
	 /*@GetMapping("/m/{track}/")
	    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, 
	    		@PathVariable("lesson") String lesson){
	    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
	    }*/
}

	
	

