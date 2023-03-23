package basic.study.chapter19;

public class DivideTest {

    public static void main(String[] args) {
        //divide1();
        //ifDivide();
        //tryDivide();
        //tryDivide2();
        tryDivide3();
    }

    static void divide1() {
        int a,b,c;

        a = 2;
        b = 0;
        c = a / b;
        // java.lang.ArithmeticException: / by zero
        System.out.println("c = " + c);
        System.out.println("프로그램 실행 완료");
    }

    static void ifDivide() {
        int a,b,c;

        a = 2;
        b = 0;
        if (b != 0) {
            c = a / b;
            System.out.println("c = " + c);
        }
        System.out.println("프로그램 실행 완료");
    }

    static void tryDivide() {
        int a,b,c;

        a = 2;
        b = 0;
        try {
            c = a / b;
            System.out.println("c = " + c);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기 예외 발생!");
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 실행 완료");
    }

    static void tryDivide2() {
        int a,b,c;

        a = 5;
        b = 2;
        int[] ar = { 1,2,3,4,5};

        try {
            c = a / b;
            System.out.println("c = " + c);
            ar[5] = 100;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기 예외 발생!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("첨자가 배열 범위를 넘었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 실행 완료");
    }

    static void tryDivide3() {
        int a,b,c;

        a = 5;
        b = 2;
        int[] ar = { 1,2,3,4,5};

        try {
            c = a / b;
            System.out.println("c = " + c);
            ar[5] = 100;
        } catch (RuntimeException e) {
            System.out.println("실행 중 예외 발생");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 실행 완료");
    }

    static void tryDivide4() {
        int a,b,c;

        a = 5;
        b = 2;
        int[] ar = { 1,2,3,4,5};

        try {
            c = a / b;
            System.out.println("c = " + c);
            ar[5] = 100;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("0으로 나누기 또는 배열 범위 초과 예외 발생");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 실행 완료");
    }
}
