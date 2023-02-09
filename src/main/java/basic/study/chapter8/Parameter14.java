package basic.study.chapter8;

public class Parameter14 {

    public static void main(String[] args) {

        System.out.println("[3, 5]" + getMax(3, 5));
        System.out.println("[3.4, 5.6]" + getMax(3.5, 5.6));
    }

    static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    static double getMax(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
