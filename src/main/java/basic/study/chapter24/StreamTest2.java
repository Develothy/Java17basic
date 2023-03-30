package basic.study.chapter24;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamTest2 {

    public static void main(String[] args) {
        //limitTest();
        //skipTest();
        //limitSkipTest();
        //multipleTest();
        //sortedTest();
        //compareTest();
        comparing();
    }

    static void comparing() {
        Data.nara.stream()
                .sorted(Comparator.comparing(Country::getPopu))
                .forEach(System.out::println);
    }

    static void compareTest() {
        Data.nara.stream()
                .sorted((o1, o2) -> o1.popu - o2.popu)
                .forEach(System.out::println);

/*        Data.nara.stream()
                .sorted()       // Compareable을 구현했음
                .forEach(System.out::println);*/
    }

    static void multipleTest() {
        Stream.iterate(2 , a -> a * 2)
                .limit(10)
                .forEach(n -> System.out.print(n + " "));
    }

    static void sortedTest() {
        Data.nara.stream()
                .map(Country::getName)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
    }

    static void limitSkipTest() {
        Data.nara.stream()
                .skip(2)
                .limit(5)
                .forEach(System.out::println);
        System.out.println("=========================");

        Data.nara.stream()
                .limit(5)
                .skip(2)
                .forEach(System.out::println);  // 5개 중에 2개를 건너 뜀
    }

    static void limitTest() {
        Data.nara.stream()
                .limit(4)
                .forEach(System.out::println);
    }

    static void skipTest() {
        Data.nara.stream()
                .skip(7)    // 7개를 건너 뜀
                .forEach(System.out::println);
    }

}
