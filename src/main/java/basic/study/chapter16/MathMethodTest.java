package basic.study.chapter16;

import java.util.Random;

public class MathMethodTest {

    public static void main(String[] args) {

        //MathAdjustMethod();
        //mathRound();
        //mathRoundNth();
        //mathRoundTest();
        //radianTest();
        //sinTest();
        //randomTest();
        //randomTest2();
        //randomNextIntTest();
        //randomRangeTest();


    }

    static void MathAdjustMethod() {
        System.out.println("왼쪽 : " + Math.floor(1.6));
        System.out.println("왼쪽 : " + Math.floor(-1.6));
        System.out.println("오른쪽 : " + Math.ceil(1.6));
        System.out.println("오른쪽 : " + Math.ceil(-1.6));
        System.out.println("자름 : " + (int) 1.6);
        System.out.println("자름 : " + (int) -1.6);
        System.out.println("반올림 : " + Math.round(1.6));
        System.out.println("반올림 : " + Math.round(1.4));
    }

    static void mathRoundTest() {

        double value = 123.456789;

        double value1000 = value * 1000;
        double valueRound = Math.round(value1000);
        double value3 = valueRound / 1000.0;

        System.out.println(value3);
    }

    static void mathRoundNth() {
        //거듭승..n승을 이용해 반올림 자리 선택
        System.out.println(roundNth(123.456789, 0));
        System.out.println(roundNth(123.456789, 1));
        System.out.println(roundNth(123.456789, 2));
        System.out.println(roundNth(123.456789, 3));
        System.out.println(roundNth(123.456789, 4));
    }

    static double roundNth(double value, int n) {
        // pow는 거듭승
        double multi = Math.pow(10, n);
        return Math.round(value * multi)/multi;
    }

    static void radianTest() {
        System.out.println("45도 = " + Math.toRadians(45));
        System.out.println("1 라디안 = " + Math.toDegrees(1));     // 라디안... 원주가 반지름과 같아지는 각도..
        System.out.println("3.14 라디안 = " + Math.toDegrees(Math.PI));
    }

    static void sinTest() {

        for (double d = 0; d <= 90; d += 15) {
            System.out.println("sin(" + d + ") = " + Math.sin(Math.toRadians(d)));
        }
    }

    static void hypotTest() {
        int x = 3;
        int y = 4;
        double c = Math.hypot(x, y);
        //double c = Math.sqrt(x * x, y * y);

        System.out.println("빗변 : " + c);
    }

    static void randomTest() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Math.random());
        }
    }

    static void randomTest2() {
        for (int i = 0; i < 5; i++) {
            System.out.println((int) Math.random() * 12 + 1);   //(int) 다운캐스팅 빼면 소숫점 다나옴
        }
    }

    static void randomNextIntTest() {
        Random R = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(R.nextInt(10));
        }
    }

    static void randomRangeTest() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getRandom(5, 10));
        }
    }
    static int getRandom(int a, int b) {
        return (int)(Math.random() * (b - a)) + a;
    }

}
