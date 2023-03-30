package basic.study.chapter24;

import java.util.Optional;
import java.util.stream.IntStream;

public class StreamTest4 {

    public static void main(String[] args) {
        //reduceTest();
        //reduceTest2();
        //reduceMinMaxTest();
        //mapToIntTest();
        //rangeClosed();
    }

    static void rangeClosed() {
        int total = IntStream.rangeClosed(1, 100).sum();
        System.out.println(total);
    }

    static void mapToIntTest() {
        int total = Data.nara.stream()
                .mapToInt(Country::getPopu)
                .sum();
        System.out.println(total);
    }

    static void reduceMinMaxTest() {
        Optional<Integer> min = Data.nara.stream()
                .map(Country::getPopu)
                .reduce(Integer::min);
        System.out.println(min.get());
        Optional<Integer> max = Data.nara.stream()
                .map(Country::getPopu)
                .reduce(Integer::max);
        System.out.println(max.get());
    }

    static void reduceTest2() {
        Optional<Integer> total = Data.nara.stream()
                .map(Country::getPopu)
                .reduce(Integer::sum);
        System.out.println(total.get());
    }

    static void reduceTest() {
        int total = Data.nara.stream()
                .map(Country::getPopu)
                .reduce(0, (i,j) -> i+j);
        System.out.println(total);
    }
}
