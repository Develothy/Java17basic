package basic.study.chapter6;

public class PlusEqual2 {

    public static void main(String[] agrs) {

        int value = 2;
        value += 3;
        System.out.println("value = " + value);
        value *= 2;
        System.out.println("value = " + value);

        int value2 = 10;
        System.out.println("10 &= 2 : " + (value2 &= 2));
        System.out.println("10 |= 2 : " + (value2 |= 2));
        System.out.println("10 ^= 2 : " + (value2 ^= 2));
        System.out.println("10 <<= 2 : " + (value2 <<= 2));


    }
}
