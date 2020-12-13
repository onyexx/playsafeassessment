package za.co.playsafeassessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;
import za.co.playsafeassessment.services.ConversionServices;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
public class ConversionController {
	
	@Autowired
	ConversionServices service;
	
	@RequestMapping(method = RequestMethod.GET,value = "/ktoc/{kelvin}")
	public double ktoc(@PathVariable double kelvin) {
		
		Log.info("calculating kelvin to celsius");
		return service.kelvinToCelsius(kelvin);
		
	}
	@RequestMapping(method = RequestMethod.GET,value = "/ctok/{celsius}")
	public double  ctok(@PathVariable (value = "celsius") double celsius) {
		
		Log.info("calculating celsius to kelvin");
		
		return service.celsiusToKelvin(celsius);
	}
	@RequestMapping(method = RequestMethod.GET,value = "/mtok/{miles}")
	public double mtok(@PathVariable double miles) {
		
		Log.info("calculating miles to kilometer");
		
		return service.milesToKilometer(miles);
	}
	@RequestMapping(method = RequestMethod.GET,value = "/ktom/{kilometer}")
	public double ktom(@PathVariable double kilometer) {
		
		Log.info("calculating kilometer to miles");
		
		return service.kilometerToMiles(kilometer);
	}

}
