package basic.study.chapter24;

import java.util.Optional;

public class StreamTest3 {

    public static void main(String[] args) {
        //countTest();
        //matchTest();
        minMaxTest();
    }

    static void countTest() {
        System.out.println(Data.nara.stream().count());
    }

    static void matchTest() {
        System.out.println(Data.nara.stream().anyMatch(c -> c.cont == Cont.AFRICA));
        System.out.println(Data.nara.stream().allMatch(c -> c.popu > 10));
        System.out.println(Data.nara.stream().noneMatch(c -> c.popu < 8));
    }

    static void minMaxTest() {
        Optional<Integer> max = Data.nara.stream()
                        .map(Country::getPopu)
                        .max((a, b) -> a-b);
        System.out.println(max.get());

        Optional<Integer> min = Data.nara.stream()
                        .map(Country::getPopu)
                        .min((a, b) -> a-b);
        System.out.println(min.get());
    }
}
