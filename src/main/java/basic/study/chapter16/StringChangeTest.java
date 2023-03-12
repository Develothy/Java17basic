package basic.study.chapter16;

import java.util.Arrays;
import java.util.List;

public class StringChangeTest {


    public static void main(String[] args) {
        // changeCase();
        //replaceTest();
        //subStringTest();
        //stringAssign();
        //splitTest();
        joinTest();
    }

    static void changeCase() {
        String str = "Lee Woo Rim";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        str.toLowerCase(); // 문자열 자체를 변경하는 것은 아님.
        System.out.println(str);

        str = str.toLowerCase();
        System.out.println(str);
    }

    static void replaceTest() {
        String str = "모모는 세상에 하나뿐인 종, 모모는 푸숑";
        System.out.println(str.replace("모모", "만쥬"));
        System.out.println(str.replaceFirst("모모", "만쥬"));
    }

    static void subStringTest() {
        String str = "0123456789";
        System.out.println(str.substring(3, 7));

        String name = "제 이름은 <이우림>입니다.";
        int st, ed;
        st = name.indexOf('<');
        ed = name.indexOf('>');
        System.out.println(name.substring(st+1, ed));
    }

    static void stringAssign() {
        String s = "korea";
        String s2 = s;

        s2 += " fighting";

        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);
    }

    static void splitTest() {
        String city = "서울,대전,대구,부산";
        String[] token = city.split(",");

        for (String s : token) {
            System.out.println(s);
        }
    }

    static void joinTest() {
        String path = String.join("/", "user", "data", "app");
        System.out.println(path);

        String seoul = "서울", daejun = "대전", daegu = "대구", busan = "부산";
        String city = String.join(",", seoul, daejun, daegu, busan);
        System.out.println(city);

        List<String> subway = Arrays.asList("서울역", "남영", "용산", "노량진");
        System.out.println(String.join(" -> ", subway));
    }
}
