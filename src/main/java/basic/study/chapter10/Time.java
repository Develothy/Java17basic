package basic.study.chapter10;

public class Time {
    private boolean am;
    private int hour;
    private int minute;
    private int second;

    Time() {}

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >=0 && hour <=23){
            this.am = hour < 12;
            this.hour = hour % 12;
            if (this.hour == 0) this.hour = 12;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second >=0 && second <=59) {
            this.second = second;
        }
    }

    void whatTime() {
        System.out.print(am ? "오전 " : "오후 ");
        System.out.println(hour +"시 "+minute+"분 "+second+"초");
    }

}
