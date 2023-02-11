package basic.study.chapter9;

public class Time {
    boolean am;
    int hour;
    int minute;
    int second;

    void whatTime() {
        System.out.print(am ? "오전 " : "오후" );
        System.out.println(hour +"시 "+ minute +"분 " + second +"초");
    }
}
