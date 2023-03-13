package com.phase2.FlyAway.controller;
import com.phase2.FlyAway.model.Airline;
import com.phase2.FlyAway.service.*;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") 
public class AirlineController {
	@Autowired
	AirlineService airlineService;
	
	
	@GetMapping("/airline")
	public List<Airline> getAirlines(){
		return airlineService.getAirlines();
	}
	//current error:
	//org.springframework.web.bind.MissingServletRequestParameterException: 
	//Required request parameter 'id' for method parameter type int is not present
//	@RequestParam("id")
	@PostMapping(value="/airline", produces = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
	public void createAirline(@RequestParam("id")Integer id, @RequestParam("airline_name")String airlineName,Airline airline){
//		airline.setId(id);
//		airline.setAirlineName(airlineName);
		airlineService.createAirline(id, airlineName, airline);
//		return airline.getId();
		
	}
}
