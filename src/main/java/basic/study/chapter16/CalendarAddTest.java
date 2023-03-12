package basic.study.chapter16;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarAddTest {

    public static void main(String[] args) {

        after100();
        birth();
    }

    static void after100() {

        GregorianCalendar today = new GregorianCalendar();
        System.out.printf("오늘 날짜 : %d월 %d일\n",
                today.get(Calendar.MONTH) + 1,
                today.get(Calendar.DATE));

        today.add(Calendar.DATE, 100);
        System.out.printf("100일 후는 : %d월 %d일\n",
                today.get(Calendar.MONTH) + 1,
                today.get(Calendar.DATE));
    }

    static void birth() {
        GregorianCalendar birth = new GregorianCalendar(1995,4,3);
        GregorianCalendar today = new GregorianCalendar();

        long diff = today.getTimeInMillis() - birth.getTimeInMillis();
        long days = diff / (24*60*60*1000);
        System.out.println("오늘은 태어난지 " + days + "일째");
    }
}
