package basic.study.chapter15.boxing;

public class UnBoxingTest {

    public static void main(String[] args) {

        Integer wrapint = Integer.valueOf("629");
        int i = wrapint.intValue();
        System.out.println(i);

        Double wrapdouble = Double.valueOf("3.14");
        int di = wrapdouble.intValue();
        System.out.println(di);

    }
}
