import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public interface EventCatalog {

    void addCatalogEntry(Event event, Time time);
    void addTimeToEvent(Event event, Time time);
    Set<Event> getAllEvents();
    Set<Time> getTimesOfEvent(Event event);
    Map<Event, Time> filterByEventCategory(EventCategory category);
    void deleteEvent(Event event);
    void deleteTime(Event event, Time time);
}
