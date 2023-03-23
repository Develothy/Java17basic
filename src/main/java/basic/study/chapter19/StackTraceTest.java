package basic.study.chapter19;

public class StackTraceTest {

    public static void main(String[] args) {
        //method();
        method2();
    }

    static void method() {
        submethod();
    }

    static void submethod() {
        int i;
        int a = 3, b = 0;
        i = a / b;
        System.out.println(i);
    }

    static void method2() {
        try {
            submethod2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    static void submethod2() {
        int i;
        int a = 3, b = 0;
        try {
            i = a / b;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
