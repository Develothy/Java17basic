package basic.study.chapter16;

public class StringSearchTest {

    public static void main(String[] args) {

        String str = "String Search Method of String Class";

        System.out.println("앞쪽 t = " + str.indexOf('t'));
        System.out.println("뒤쪽 t = " + str.lastIndexOf('t'));
        System.out.println("앞쪽 z = " + str.indexOf('z'));   //z 없음
        System.out.println("앞쪽 String = " + str.indexOf("String"));
        System.out.println("뒤쪽 String = " + str.lastIndexOf("String"));

        String[] files = {
                "girl.jpg",
                "boy.png",
                "idol.mp4",
                "baking.jpg",
                "dog.gif"
        };

        for (String s : files) {
            if (s.endsWith(".jpg")) {
                System.out.println(s);
            }
        }

    }
}
