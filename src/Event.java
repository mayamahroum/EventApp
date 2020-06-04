import java.util.*;
import java.util.TreeMap;

public class Event implements Comparable<Event> {

	private String title;
	private EventCategory category;
	private Time time;
	private TreeMap<Event, Set<Time>> map;

	public Event(String title, EventCategory category){
	   this.title = title;
	   this.category = category;
    }

    public String getTitle() {
		return title;
	}

	public EventCategory getCategory() {
		return category;
	}

	@Override
	public int compareTo(Event o) {
		int title = this.title.compareTo(o.title);
		return title == 0 ? this.category.compareTo(o.category) : title;
	}

}




