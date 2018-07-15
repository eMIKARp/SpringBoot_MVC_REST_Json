package pl.mojaaplikacja.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.mojaaplikacja.model.City;

@RestController
public class CityController {

	@RequestMapping("/city")
	public City getCity() {
		return new City("Warsaw", 1700000);
	}
}
