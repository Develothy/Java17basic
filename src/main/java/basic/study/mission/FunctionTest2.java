package basic.study.mission;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionTest2 {
    public static void main(String[] args){

        // 매개변수 없이 리턴값만 있음  // T get()
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;

        // 매개변수 있고 리턴값은 없음 // void accept(T t)
        Consumer<Integer> c = i -> System.out.print(i + ", ");

        // 매개변수 있고 리턴은 boolean(조건식 표현)  // boolean test(T t)
        Predicate<Integer> p = i -> i % 2 == 0;

        // 매개변수 있고 리턴 있음  // R apply(T t) 결과값 리턴
        Function<Integer, Integer> f = i -> i * 10;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);

        printEventNum( p, c, list);
        List<Integer> newList = addListByFunction(f, list);
        System.out.println("printEventNum -> addListByFunction : " + newList);
    }

    static <T> List<T> addListByFunction(Function<T, T> f, List<T> list){
        List<T> newList = new ArrayList<T>(list.size());

        for(T i: list){
            newList.add(f.apply(i));    // function (i -> i * 10)
        }

        return newList;
    }

    static <T> void printEventNum(Predicate<T> p, Consumer<T> c, List<T> list){
        System.out.print("printEventNum : [ ");
        for(T i : list){
            if(p.test(i)) {   // predicate (i -> i % 2 == 0)
                c.accept(i);  // consumer (System.out.print)
            }
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list){
        for (int i = 0; i < 10; i++) {
            list.add(s.get());  // supplier (Math.random() * 100 정의)
        }
    }
}

