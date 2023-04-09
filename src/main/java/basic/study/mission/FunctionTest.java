package basic.study.mission;

import java.util.*;

public class FunctionTest {

    public static void main(String[] args){
        List<Integer> list0 = Arrays.asList( 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 ); // 구조가 바뀌는 removeAll은 안됨…
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // list의 모든 요소를 출력
        list.forEach(i -> System.out.print(i + ","));
        System.out.println();

        // list에서 2 또는 3의 배수를 제거하는 람다식
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);

        // list의 각 요소에 10을 곱하는 람다식
        list.replaceAll(i -> i * 10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        // map의 모든 요소를 { k : v }의 형식으로 출력
        map.forEach((k, v) -> System.out.println("{ " + k + " : " + v + " }"));
    }
}
