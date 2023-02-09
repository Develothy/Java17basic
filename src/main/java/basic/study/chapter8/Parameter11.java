package basic.study.chapter8;

public class Parameter11 {

    public static void main(String[] args) {

        int num = 2;
        getDouble(num);                     // 기본형 num = getDouble(num) 정상
        System.out.println("num = "+num);
    }

    static int getDouble(int value) {
        return value *=2;
    }
}
