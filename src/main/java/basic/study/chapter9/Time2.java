package basic.study.chapter9;

public class Time2 {
    boolean am = true;
    int hour = 12;
    int minute = 0;
    int second = 0;

    // 디폴트 생성자 new Time2();
    Time2(){}

    // 초기화 블록
    {
        java.time.LocalTime now = java.time.LocalTime.now();
        hour = now.getHour();
        if (hour >= 12) {
            hour -= 12;
            am = false;
        } else {
            am = true;
        }
        minute = now.getMinute();
        second = now.getSecond();
    }

    // 생성자
    Time2(boolean am, int hour, int minute, int second) {
        this.am = am;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // 오버로딩
    Time2(boolean am, int hour, int minute) {
        this(am, hour, minute, 0);
    }

    Time2(int hour24, int minute) {
        this(hour24 < 12, hour24 % 12, minute);
    }

    void whatTime() {
        System.out.print(am ? "오전 " : "오후 ");
        System.out.println(hour +"시 "+ minute +"분 " + second +"초");
    }

}
