package basic.study.chapter15.boxing;

public class AutoBoxingTest {

    public static void main(String[] args) {

        Integer a = Integer.valueOf("3");
        Integer b = Integer.valueOf("4");

        int c = a + b;
        System.out.println(c);

        Integer d = Integer.valueOf(12);
        d ++;
        System.out.println(d);

    }

}
