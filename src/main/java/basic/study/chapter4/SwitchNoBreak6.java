package basic.study.chapter4;

public class SwitchNoBreak6 {

    public static void main(String[] args) {
        int days;
        int month = 5;

        switch (month) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }

        System.out.println(month + "월은 " + days + "일까지 있습니다.");
    }
}
