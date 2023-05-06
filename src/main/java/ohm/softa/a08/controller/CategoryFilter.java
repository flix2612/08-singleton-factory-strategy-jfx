package ohm.softa.a08.controller;

import ohm.softa.a08.model.Meal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryFilter extends FilterBase{

	private String category;

	public CategoryFilter(String category ) {
		this.category = category.toLowerCase();
	}

	@Override
	protected boolean include(Meal meal) {
		return !meal.getCategory().toLowerCase().contains(category);
	}

}
