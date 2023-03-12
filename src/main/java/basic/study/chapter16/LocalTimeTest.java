package basic.study.chapter16;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeTest {

    public static void main(String[] args) {
        //localTimeTest1();
        after100();
    }

    static void localTimeTest1() {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초",
                        today.getYear(),
                        today.getMonthValue(),
                        today.getDayOfMonth(),
                        now.getHour(),
                        now.getMinute(),
                        now.getSecond()
                );
    }

    static void after100() {
        LocalDate today = LocalDate.now();
        LocalDate after100 = today.plusDays(100);
        System.out.printf("100일 후는 %d월 %d일입니다.",
                        after100.getMonthValue(),
                        after100.getDayOfMonth()
                );
    }
}
