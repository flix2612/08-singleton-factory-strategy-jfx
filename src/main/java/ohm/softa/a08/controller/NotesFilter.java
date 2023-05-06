package ohm.softa.a08.controller;

import ohm.softa.a08.model.Meal;

import java.util.List;

public class NotesFilter extends FilterBase{

	private final String note;
	public NotesFilter(String note) {
		this.note = note.toLowerCase();
	}

	@Override
	protected boolean include(Meal meal) {
		List<String> notes = meal.getNotes();
		for (String note : notes) {
			if (note.toLowerCase().contains(this.note)) {
				return false;
			}
		}
		return true;
	}
}
