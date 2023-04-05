package basic.study.chapter24;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        intStreamTest();
        arrayStreamTest();
    }

    static void intStreamTest() {
        // Stream<Integer> stream = Stream.of(3, 1, 4, 1, 5);
        // stream.forEach(System.out::print);
        // 위와 동일
        Stream.of(3, 1, 4, 1, 5).forEach(System.out::print);
    }

    static void arrayStreamTest() {
        String[] ar = {"한국", "중국", "일본"};
        Stream<String> stream = Arrays.stream(ar);
        stream.forEach(System.out::print);
    }
}
