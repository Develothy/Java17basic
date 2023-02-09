package basic.study.chapter7;

public class Lookup15 {

    public static void main(String[] args) {

        int[] arrDay = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = 5;

        int days = arrDay[month];
        System.out.println(month + "월은 " + days + "일까지 있습니다.");
    }
}
