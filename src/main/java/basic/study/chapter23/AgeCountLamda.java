package basic.study.chapter23;

import java.util.function.Predicate;

public class AgeCountLamda {

    static  int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };

    public static void main(String[] args) {
        System.out.println("over : " + count(AgeCountLamda::isAgeOver));
        System.out.println("under : " + count(AgeCountLamda::isAgeUnder));
    }

    static boolean isAgeOver(int age) {
        return (age > 30);
    }

    static boolean isAgeUnder(int age) {
        return (age < 30);
    }

    static int count(Predicate<Integer> op) {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (op.test(arAge[i])) num++;
        }
        return num;
    }
}
