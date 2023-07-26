package com.romina.mostrarfecha.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller

public class MainController {
	
	 @GetMapping("/")
	    public String home() {
	        return "home.jsp";
	    }
	
	
	  @GetMapping("/date")
	    public String Fecha(Model model) {
	        Date fechaActual = new Date();
	        SimpleDateFormat formato = new SimpleDateFormat("EEEE, d 'de' MMMM, yyyy");
	        String formatoFecha = formato.format(fechaActual);
	        model.addAttribute("formatoFecha", formatoFecha);
	        return "date.jsp";
	    }
	  
	  @GetMapping("/time")
	    public String Hora(Model model) {
	        Date horaActual = new Date();
	        SimpleDateFormat formato = new SimpleDateFormat("hh:mm a");
	        String formatoHora = formato.format(horaActual);
	        model.addAttribute("formatoHora", formatoHora);
	        return "time.jsp";
	    }

}
