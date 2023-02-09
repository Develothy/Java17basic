package basic.study.chapter8;

public class FromToSum {

    public static void main(String[] args) {

        System.out.println(calcSumEven(2, 10));
    }

    static int calcSumEven(int from, int to) {

        int fromToSum = 0;
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                fromToSum += i;
            }
        }
        return fromToSum;
    }
}
