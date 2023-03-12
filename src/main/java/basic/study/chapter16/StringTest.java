package basic.study.chapter16;

public class StringTest {

    public static void main(String[] args) {
        // constructorTest();
        compare();

    }

    static void constructorTest() {

        String str = "아름다운";
        System.out.println(str);

        String str2 = "우리나라";
        System.out.println(str2);

        char[] ar = { 'k','o','r','e','a' };
        String str3 = new String(ar);
        System.out.println(str3);
        System.out.println("대한민국 길이 : " + "대한민국".length());
        System.out.println("대한민국의 2번째 단어 : " + "대한민국".charAt(2));
    }

    static void compare() {
        String str1 ="KOREA";
        String str2 ="korea";

        System.out.println("str1 과 str2는 equals? " + (str1.equals(str2) ? "같다" : "다르다"));
        System.out.println("str1 과 str2는 equalsIgnoreCase? " + (str1.equalsIgnoreCase(str2) ? "같다" : "다르다"));

        String apple = "Apple";
        String orange = "Orange";
        int Result = apple.compareTo(orange);   // 순번 비교 오른차순

        if (Result == 0) {
            System.out.println("같다");
        } else if (Result < 0) {
            System.out.println("Apple이 Orange보다 더 앞쪽");
        } else if (Result > 0) {
            System.out.println("Apple이 Orange보다 더 뒤쪽");
        }

    }



}
