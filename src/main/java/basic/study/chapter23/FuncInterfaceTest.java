package basic.study.chapter23;

public class FuncInterfaceTest {

    public static void main(String[] args) {

        PlusOne po = i -> i + 1;
        System.out.println("result : " + po.plus(6));

        print(5, i -> i + 1);
        print(5, i -> i - 1);
        print(5, i -> i * 1);

        // 지역변수 람다 참조 테스트
        int value = 123;
        PlusOne po2 = i -> { System.out.println(value);     return i + 1;   };
        System.out.println("result : " + po2.plus(value));
    }

    static void print(int i, PlusOne po) {
        System.out.println("result : " + po.plus(i));
    }
}

interface PlusOne {
    int plus(int i);
}
