package basic.study.chapter16;

import java.util.stream.Stream;

public class StringAddTest {

    public static void main(String[] args) {
        // repeatTest();
        // isBlankTest();
        //stripTest();
        //streamTest();
        //indentTest();
        transformTest();
    }

    static void repeatTest() {
        String home = "대한민국";
        String hurrah = " 만세!";

        System.out.println(home + hurrah.repeat(3));
    }

    static void isBlankTest() {
        String text = "\t \n";
        System.out.println("is Empty : " + text.isEmpty());
        System.out.println("is Blank : " + text.isBlank());
    }

    static void stripTest() {
        String text = "    it's korea    ";

        System.out.println("#" + text + "#");
        System.out.println("#" + text.strip() + "#");   // trim()과 다르점은 유니코드가 정의하는 앞뒤 공백 모두 제거
    }

    static void streamTest() {
        String text = "apple\nornge\banana";
        Stream<String> fruits = text.lines();
        fruits.forEach(System.out::println);
    }

    static void indentTest() {
        String text = "<body>\n<p>sample</p>\n</body>";
        System.out.println(text);
        System.out.println(text.indent(4)); // 말 머리에 공백추가
    }

    static void transformTest() {
        String text = "korea";
        System.out.println((String) text.transform(t -> t + " hello"));
        String num = "12";
        System.out.println(num.transform(Integer::parseInt) * 2);
    }



}
