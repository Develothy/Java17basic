package basic.study.chapter16;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

    public static void main(String[] args) {
        //calendarTest1();
        calendarTest2();
    }

    static void calendarTest1() {
        GregorianCalendar today = new GregorianCalendar();
        System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초",
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH) + 1,
                today.get(Calendar.DATE),
                today.get(Calendar.AM_PM) == Calendar.AM ? "오전 " : "오후 ",
                today.get(Calendar.HOUR),
                today.get(Calendar.MINUTE),
                today.get(Calendar.SECOND)
        );
    }

    static void calendarTest2() {
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 a hh:mm:ss");
        String result = sdf.format(today.getTime());
        System.out.println(result);
    }

}
