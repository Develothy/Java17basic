package basic.study.chapter10;

public class TimeTest {

    public static void main(String[] args) {

        Time now = new Time(12, 34, 56);
        now.whatTime();
        //now.hour = 34             //에러
        now.setHour(34);            //거부
        now.setSecond(-25);         //거부
        now.whatTime();
        now.setHour(10);            //가능
        now.setMinute(45);          //가능
        now.whatTime();
    }
}
