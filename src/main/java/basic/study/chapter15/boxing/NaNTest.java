package basic.study.chapter15.boxing;

public class NaNTest {

    public static void main(String[] args) {

        System.out.println(3.14/0.0);
        System.out.println(-3.14/0.0);
        System.out.println(Math.sqrt(-2)); // 음수의 제곱근

        System.out.println(Double.isInfinite(3.14/0.0));
        System.out.println(Double.isInfinite(-3.14/0.0));
        System.out.println(Double.isNaN(3.14/0.0));
        System.out.println(Double.isNaN(-3.14/0.0));
        System.out.println(Double.isNaN(3.14));
        System.out.println(Double.isNaN(Math.sqrt(-2)));

        isNaN(Math.sqrt(-2));
    }

    static void isNaN(Double d) {

        if (Double.isNaN(d)) {
            System.out.println("숫자가 아님");
        } else {
            System.out.println("숫자가 맞음");
        }
    }
}
