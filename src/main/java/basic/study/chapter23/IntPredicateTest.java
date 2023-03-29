package basic.study.chapter23;

import java.util.function.IntPredicate;

public class IntPredicateTest {

    public static void main(String[] args) {

        IntPredicate isEven = n -> n % 2 == 0;
        IntPredicate over10 = n -> n > 10;

        IntPredicate isOdd = isEven.negate();
        IntPredicate evenAndOver10 = isEven.and(over10);
        IntPredicate evenOrOver10 = isEven.or(over10);

        System.out.println("7은 홀수인가 : " + isOdd.test(7));
        System.out.println("12는 10보다 큰 짝수인가 : " + evenAndOver10.test(12));
        System.out.println("8는 10보다 큰 짝수인가 : " + evenAndOver10.test(8));
        System.out.println("15는 10보다 크거나 짝수인가 : " + evenOrOver10.test(15));
    }
}
