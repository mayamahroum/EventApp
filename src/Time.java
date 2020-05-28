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

    public void increment()
    {
        if (hour == 23 && minute == 59)
        {
            hour = 0;
            minute = 0;
        }
        else
        {
            minute++;
            if (minute == 60)
            {
                hour++;
                minute = 0;
            }
            else if ( hour == 24)
                hour = 0;
        }
    }


}