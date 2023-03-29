package basic.study.chapter23;

import java.util.function.Predicate;

public class AgeCountPredicateTest {

    static  int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };

    public static void main(String[] args) {
        System.out.println("over : " + count(a -> a > 30));
        System.out.println("under : " + count(a -> a < 30));
    }

    static int count(Predicate<Integer> pred) {
        int num = 0;
        for (int a : arAge) {
            if (pred.test(a)) num++;
        }
        return num;
    }
}


