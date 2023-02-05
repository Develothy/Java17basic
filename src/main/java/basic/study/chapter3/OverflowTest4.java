package basic.study.chapter3;

public class OverflowTest4 {
    public static void main(String[] args) {
        byte value = 127;
        value++;
        System.out.println(value);

        int value2 = 1234567890;
        value2 = value2 * 2;
        System.out.println(value2);
    }
}
