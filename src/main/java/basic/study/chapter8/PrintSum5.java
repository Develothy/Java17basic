package basic.study.chapter8;

public class PrintSum5 {

    public static void main(String[] args) {

        printSum(1,10);
        printSum(15,100);
    }

    static void printSum(int from, int to) {

        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        System.out.println(from + " ~ " + to + " = " + sum);
    }
}
