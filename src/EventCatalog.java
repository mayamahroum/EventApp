import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

interface EventCatalog {

    boolean addCatalogEntry(Event event, Set<Time> tSet);
    boolean addTimeToEvent(Event event, Time time);
    Set<Event> getAllEvents();
    Set<Time> getTimesOfEvent(Event event);
    Map<Event, Set<Time>> filterByEventCategory(EventCategory category);
    void deleteEvent(Event event);
    boolean deleteTime(Event event, Time time);
}
