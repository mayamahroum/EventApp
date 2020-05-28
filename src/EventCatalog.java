public interface EventCatalog {

    void addCatalogEntry();


    void addTimeToEvent();
    int getTimesOfEvent();
    void filterByEventCategory();
    void deleteEvent();
    void deleteTime();
}
