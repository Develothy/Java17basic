package basic.study.chapter24;

import java.util.*;
import java.util.stream.Collectors;

public class CollectTest {

    public static void main(String[] args) {
        //collectToListTest();
        //collectJoiningTest();
        //collectMinMaxTest();
        //collectOperTest();
        //summaryTest();
        //reduceSumTest();
        //groupingTest();
        groupingTest2();
    }

    static void groupingTest2() {
        Map<Boolean, List<Country>> map = Data.nara.stream()
                .collect(Collectors.groupingBy(Country::isOecd));

        Set<Boolean> keys = map.keySet();
        Iterator<Boolean> key = keys.iterator();
        while (key.hasNext()) {
            Boolean oecd = key.next();
            System.out.print(oecd + " : ");
            List<Country> n = map.get(oecd);
            for (Country c : n) {
                System.out.print(c.name + " ");
            }
            System.out.println();
        }
    }

    static void groupingTest() {
        Map<Cont, List<Country>> map = Data.nara.stream()
                .collect(Collectors.groupingBy(Country::getCont));

        Set<Cont> keys = map.keySet();
        Iterator<Cont> key = keys.iterator();
        while (key.hasNext()) {
            Cont cont = key.next();
            System.out.print(cont + " : ");
            List<Country> n = map.get(cont);
            for (Country c : n) {
                System.out.print(c.name + " ");
            }
            System.out.println();
        }
    }

    static void reduceSumTest() {
        int sum = Data.nara.stream()
                .collect(Collectors.reducing(0, Country::getPopu, Integer::sum));
        System.out.println(sum);
    }

    static void summaryTest() {
        IntSummaryStatistics summary = Data.nara.stream()
                .collect(Collectors.summarizingInt(Country::getPopu));
        System.out.println(summary);
    }

    static void collectOperTest() {
        int sum = Data.nara.stream()
                .collect(Collectors.summingInt(Country::getPopu));
        System.out.println(sum);
        double avg = Data.nara.stream()
                .collect(Collectors.averagingInt(Country::getPopu));
        System.out.println(avg);
    }

    static void collectMinMaxTest() {
        long num = Data.nara.stream()
                .collect(Collectors.counting());
        System.out.println(num);
        Optional<Integer> max = Data.nara.stream()
                .map(Country::getPopu)
                .collect(Collectors.maxBy(Integer::compare));
        System.out.println(max.get());
        Optional<Integer> min = Data.nara.stream()
                .map(Country::getPopu)
                .collect(Collectors.minBy(Integer::compare));
        System.out.println(min.get());
    }

    static void collectJoiningTest() {
        String names = Data.nara.stream()
                .map(Country::getName)
                .collect(Collectors.joining(", "));
        System.out.println(names);
    }

    static void collectToListTest() {
        List<String> names = Data.nara.stream()
                .map(Country::getName)
                .collect(Collectors.toList());
        for (String n : names) {
            System.out.print(n + " ");
        }
    }
}
