package basic.study.chapter9;

public class TimeTest {

    public static void main(String[] args) {

        Time now = new Time();
        now.am = true;
        now.hour = 12;
        now.minute = 34;
        now.second = 56;

        now.whatTime();
    }

}
