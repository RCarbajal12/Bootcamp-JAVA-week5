package com.romina.enrutamiento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	 @GetMapping("/m/{track}")
    public String showLesson(@PathVariable("track") String track){
		 if(track.contentEquals("dojo")) {
			 return "El dojo es increible";
		 }
		 else if(track.contentEquals("burbank-dojo")) {
			 return "El Dojo Burbank está localizado al sur de California";
		 }
		 else if(track.contentEquals("san-jose")) {
			 return "El Dojo SJ es el cuartel general";
		 }
    	return "No reconozco a " + track ;
    }
	 
	 


}
