package basic.study.chapter6;

public class Sign5 {

    public static void main(String[] args) {
        int value = 8;
        System.out.println(value);
        value = -value;
        System.out.println(value);

        int value2 = -8;
        if (value2 < 0) {
            value2 = -value2;
        }
        System.out.println("value2 = " + value2);

    }
}
