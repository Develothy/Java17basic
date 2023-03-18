package basic.study.chapter17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashcodeTest {

    public static void main(String[] args) {
        //checkHashcode();
        checkHashSet();
    }

    static void checkHashcode() {
        HashMap<Human, Integer> donate = new HashMap<>();
        donate.put(new Human(29, "이우림"), 100000);
        donate.put(new Human(33, "정지훈"), 200000);
        donate.put(new Human(35, "이효리"), 750000);
        donate.put(new Human(20, "박수현"), 550000);

        Human park = new Human(20, "박수현");
        System.out.println(park.name + "씨의 기부금 = " + donate.get(park));
        // null. 같은 Human 타입이지만 park 객체의 주소값이 다르다. => hashcode() 재정의
        // 재정의 해서 뜸.
    }

    static void checkHashSet() {
        HashSet<String> kangwon = new HashSet<>();  // 순서 x
        kangwon.add("춘천시");
        kangwon.add("철원시");
        kangwon.add("정선군");
        kangwon.add("강릉시");

        Iterator<String> it = kangwon.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
