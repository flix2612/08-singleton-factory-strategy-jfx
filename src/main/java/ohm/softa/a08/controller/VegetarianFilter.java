package ohm.softa.a08.controller;

import ohm.softa.a08.model.Meal;

import java.util.List;
import java.util.stream.Collectors;

public class VegetarianFilter implements MealsFilter{
	@Override
	public List<Meal> filter(List<Meal> meals) {
		return meals.stream()
			.filter(Meal::isVegetarian)
			.collect(Collectors.toList());
	}
}
