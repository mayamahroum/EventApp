import java.util.*;

 public class EventCatalogImpl extends java.util.TreeMap<Event, Set<Time>> implements EventCatalog {
     TreeMap<Event, Set<Time>> tmap = new TreeMap<>();
     Set<Time> times = new HashSet<>();
     Set<Event> events = new HashSet<Event>();

     public boolean addCatalogEntry(Event event, Set<Time> tSet) {
        if (!(tmap.containsKey(event))) {
             tmap.put(event, tSet);
             return true;
         }
        return false;
     }

     public boolean addTimeToEvent(Event event, Time time) {
         times.add(time);
         for (Map.Entry<Event, Set<Time>> m : tmap.entrySet()) {
             tmap.put(event, times);
         }
         return true;
     }

     public Set<Event> getAllEvents() {
         if (tmap != null) {
             System.out.println("The events are:");
             for (Event s : tmap.keySet()) {
                 System.out.println(s.getTitle());
             }
             return tmap.keySet();
         }
         return null;
     }

     public Set<Time> getTimesOfEvent(Event event) {
         System.out.print("The event" + event.getTitle() + "is happening at: ");
         if (tmap.containsKey(event)) {
             for (Time t : tmap.get(event)) {
                 if (t != null) {
                     System.out.println(Integer.toString(t.getHour()) + ":" + Integer.toString(t.getMinute()));
                 } else System.out.println("Time is not set for this event");
             }
             return times;
         } else {

             System.out.println("Event does not exist.");
             return null;
         }
     }

     public Map<Event, Set<Time>> filterByEventCategory(EventCategory category) {
         Map<Event, Set<Time>> categoryMap = new TreeMap<>();
         for (Event s : tmap.keySet()) {
             if (s.getCategory() == category) {
                 categoryMap.put(s, tmap.get(s));
             }
         }
         System.out.println("The events in this category are:");
         for (Event t : categoryMap.keySet()) {
             System.out.println(t.getTitle());
         }
         return categoryMap;
     }

     public void deleteEvent(Event event) {
         if (tmap.containsKey(event)){
             System.out.println("The event " + event.getTitle() + " has been removed.");
             tmap.entrySet().remove(event);
         }
     }

     public boolean deleteTime(Event event, Time time) {
         System.out.println("The time of the event " + event.getTitle() + " has been removed.");
         if (tmap.get(event) == time) {
             values().remove(time);
             return true;
         }
         else return false;
     }
 }





