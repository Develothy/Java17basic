package basic.study.chapter6;

public class Arithmetic1 {

    public static void main(String[] args) {

        int a = 6, b = 4;
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " / " + b + " = " + ((float) a / b));


        System.out.println("나머지 값 구하기");
        System.out.println("6 %% 4 = " + 6 % 4);
        System.out.println("7 %% 3 = " + 7 % 3);
        System.out.println("5.0 %% 2.3 = " + 5.0 % 2.3);
        System.out.println("14 %% 2 = " + 14 % 2);
        System.out.println("15 %% 2 = " + 15 % 2);
    }
}
