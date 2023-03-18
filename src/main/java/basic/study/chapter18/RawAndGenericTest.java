package basic.study.chapter18;

import java.util.ArrayList;

public class RawAndGenericTest {

    public static void main(String[] args) {

    }

    static void rawList() {
        ArrayList arNum = new ArrayList<>();
        arNum.add(1);
        arNum.add("문자열");
        int value = (int) arNum.get(0);
        // int temp = (int) arNum.get(1);   // 캐스팅으로 단언했기 때문에 컴파일러는 컴파일 시점에 알아채지 못함
        System.out.println(value);
    }

    static void genericTest() {
        ArrayList<Integer> arNum = new ArrayList<>();
        arNum.add(1);
        // arNum.add("문자열");    // generic 타입 명시. 컴파일 시점에 체크됨
        int value = (int) arNum.get(0);
        System.out.println(value);
    }
}
