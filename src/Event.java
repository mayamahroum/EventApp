import java.util.*;
import java.util.TreeMap;

public class Event implements Comparable<Event> {

	private String title;
	private EventCategory category;
	private Time time;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public EventCategory getCategory() {
		return category;
	}

	public void setCategory(EventCategory category) {
		this.category = category;
	}

	@Override
	public int compareTo(Event o) {
		int title = this.title.compareTo(o.title);
		return title == 0 ? this.category.compareTo(o.category) : title;
	}



	void addCatalogEntry(Event event, Time time) {
		if (event.title != null) {


		}
	}


}




