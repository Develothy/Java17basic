package basic.study.chapter6;

public class StringInt8 {

    public static void main(String[] args) {

        String num = "123";
        int value = Integer.parseInt(num);
        value++;
        System.out.println("정수 = " + value);
        
        String str = String.valueOf(value);
        System.out.println("문자열 = " + str);
    }
}
