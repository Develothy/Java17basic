package basic.study.chapter9;

public class TimeTest2 {

    public static void main(String[] args) {

        Time2 now = new Time2(true,12 , 34);
        now.whatTime();
        Time2 today = new Time2(18, 30);
        today.whatTime();

        Time2 initNow = new Time2();
        initNow.whatTime();
    }
}
