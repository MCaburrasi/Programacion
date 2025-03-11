package _java.unidad6.clases;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
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

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        setSecond(second);
        setMinute(minute);
        setHour(hour);
    }

    public Time nextSecond(){
        return changeSecond(1, this);
    }

    public Time previousSecond(){
        return changeSecond(-1, this);
    }

    private Time changeSecond(int changeNumber, Time t){
        t.second += changeNumber;
        if (t.second == -1 || t.second == 60){
            setSecond(changeNumber == 1 ? 0 : 59);
            t.minute += changeNumber;
            if (t.minute == -1 || t.minute == 60){
                setMinute(changeNumber == 1 ? 0 : 59);
                t.hour += changeNumber;
            }
        }

        if (t.hour >= 24)
            setTime(0,0,0);
        if (t.hour <= -1)
            setTime(23, 59, 59);
        return t;
    }

    @Override
    public String toString() {
        return String.format("Time[%02d : %02d : %02d]", hour, minute, second);
    }
}
