import java.util.*;

public class EventApp {

    public static void main(String[] args) {
        EventCatalogImpl catalog = new EventCatalogImpl();
        Event newEvent1 = new Event("ESE", EventCategory.EXHIBITION);
        Event newEvent2 = new Event("First Day", EventCategory.PRESENTATION);
        Event newEvent3 = new Event("Second Day", EventCategory.PRESENTATION);
        catalog.addCatalogEntry(newEvent1, new HashSet<>());
        catalog.addCatalogEntry(newEvent2, new HashSet<>());
        catalog.addCatalogEntry(newEvent3, new HashSet<>());
        Time t = new Time(10, 30);
        catalog.addTimeToEvent(newEvent3, t);
        Set<Event> allEvents = catalog.getAllEvents();
        catalog.getTimesOfEvent(newEvent3);
        Map<Event,Set<Time>> allPresentations = catalog.filterByEventCategory(EventCategory.PRESENTATION);
        catalog.deleteEvent(newEvent1);
        catalog.deleteTime(newEvent3, t);
        Set<Event> allEventsAfter = catalog.getAllEvents();
        catalog.getTimesOfEvent(newEvent3);

    }
    }

