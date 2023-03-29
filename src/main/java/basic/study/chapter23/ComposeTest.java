package basic.study.chapter23;

import java.util.function.Function;

public class ComposeTest {

    public static void main(String[] args) {

        Function<String, Integer> engToNum = e -> {
            if (e.equals("one")) return 1;
          return 0;
        };

        Function<Integer, String> numToHan = e -> {
            if (e == 1) return "하나";
          return "영";
        };

        // 두개의 람다를 순서대로 호출하기
        String eng = "one";
        int num = engToNum.apply(eng);
        String han = numToHan.apply(num);
        System.out.println(han);

        // 연속으로 호출하기
        Function<String, String> engToHan = engToNum.andThen(numToHan);
        System.out.println(engToHan.apply("one"));

        // 연속으로 호출하기
        Function<String, String> engToHan2 = numToHan.compose(engToNum);
        System.out.println(engToHan2.apply("one"));


    }
}
