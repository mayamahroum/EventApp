public class Time {
    private int hour;
    private int minute;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public Time(int h, int m) {
        if (h >= 1 && h <= 23)
            this.hour = h;
        else
            hour = 0;
        if (m >= 0 && m <= 59)
            this.minute = m;
        else
            minute = 0;
    }
}