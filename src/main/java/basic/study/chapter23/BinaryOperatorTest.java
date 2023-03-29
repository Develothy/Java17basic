package basic.study.chapter23;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("result : " + add.apply(3, 7));
    }
}
