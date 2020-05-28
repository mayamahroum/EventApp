public class Time {
    private int hour;
    private int minute;

    public Time() {
        hour = 0;
        minute = 0;
    }

    public Time(int h, int m)
    {
        if ( h >= 1 && h <= 23)
            hour =h;
        else
            hour = 0;
        if ( m >= 0 && m <= 59)
            minute = m;
        else
            minute = 0;
    }

    private int getHour() {
        return hour;
    }

    private int getMinute() {
        return minute;
    }
}