import java.util.Calendar;
import java.util.TimeZone;

class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public MyTime(long elapsedTime) {
        setTime(elapsedTime);
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        this.second = (int) (totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;
        this.minute = (int) (totalMinutes % 60);

        long totalHours = totalMinutes / 60;
        this.hour = (int) (totalHours % 24);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
