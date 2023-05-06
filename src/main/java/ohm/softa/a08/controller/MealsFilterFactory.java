package ohm.softa.a08.controller;

import java.util.HashMap;
import java.util.Map;

public class MealsFilterFactory {
	private static Map<String, MealsFilter> map = new HashMap<>();

	static {
		map.put(null, new NoFilter());
		map.put("All", new NoFilter());
		map.put("Vegetarian", new VegetarianFilter());
		map.put("No pork", new CategoryFilter("Schwein"));
		map.put("No soy", new NotesFilter("Soja"));
	}


	public MealsFilter getStrategy(String key) {
		return map.get(key);
	}
}
