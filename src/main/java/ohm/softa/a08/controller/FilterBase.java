package ohm.softa.a08.controller;

import ohm.softa.a08.model.Meal;

import java.util.List;
import java.util.stream.Collectors;

public abstract class FilterBase implements MealsFilter{
	protected abstract boolean include(Meal meal);

	@Override
	public List<Meal> filter(List<Meal> meals) {
		return meals.stream().filter(this::include).collect(Collectors.toList());
	}
}
