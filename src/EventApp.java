import java.util.Map;
import java.util.TreeMap;

public class EventApp {

    public static void main(String[] args) {
        TreeMap<Event, Time> map = new TreeMap<>();
        Event ESE = new Event();
        ESE.setTitle("NewEvent");
        ESE.setCategory(EventCategory.PRESENTATION);
        Time time = new Time(12, 32);
        map.put(ESE, time);

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m);
        }
    }
}
