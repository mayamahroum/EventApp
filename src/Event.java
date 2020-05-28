public class Event implements Comparable<Event>{

   private String title;
    private EventCategory category;

    private String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private EventCategory getCategory() {
        return category;
    }


    public void setCategory(EventCategory category) {
        this.category = category;
    }
    
    @Override
    public int compareTo(Event o) {
        int bookTitle = this.title.compareTo(o.title);
        //Sorting by first name if last name is same d
        return bookTitle == 0 ? this.category.compareTo(o.category) : bookTitle;
    }
    }



