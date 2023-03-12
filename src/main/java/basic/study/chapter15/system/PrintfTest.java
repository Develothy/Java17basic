package basic.study.chapter15.system;

public class PrintfTest {

    public static void main(String[] args) {

        int i = 123;
        double d = 3.14;
        String str = "문자열";

        System.out.printf("i = %d, d = %f, str = %s\n", i, d, str);

        System.out.printf("i = %3$d, d = %2$f, str = %1$s\n", str, d, i);

        System.out.printf("정수 = %1$d, i = %1$d", i);

        double d2 = 3.14159265;
        System.out.printf("__%d__\n", i); // __는 여백 확인용. 의미x
        System.out.printf("__%5d__\n", i);
        System.out.printf("__%-5d__\n", i);
        System.out.printf("__%05d__\n", i);
        System.out.printf("__%6.2f__\n", d2);
        System.out.printf("__%8.4f__\n", d2);
    }
}
