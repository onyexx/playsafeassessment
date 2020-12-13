package za.co.playsafeassessment.services;

import org.springframework.stereotype.Service;

@Service
public class ConversionServices {
	
	public double kelvinToCelsius(double kelvin) {
		
		double celsius = kelvin - 273.15;
		
		return celsius;
		
	}
	
	public double celsiusToKelvin(double celsius) {
		
		double kelvin = celsius - 273.15;
		
		return kelvin;
		
	}
	public double milesToKilometer(double miles) {
		
		double kilometer = miles / 0.6214;
		
		return kilometer;
	}
	public double kilometerToMiles(double kilometer) {
		
		double miles = kilometer / 0.6214;
		
		return miles;
	}

}
