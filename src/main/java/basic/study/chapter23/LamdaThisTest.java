package basic.study.chapter23;

public class LamdaThisTest {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}

class Outer {

    void method() {
        // 지역 클래스의 this
        class PlusOne2Impl implements PlusOne2 {
            @Override
            public int plus(int i) {
                System.out.println(this);
                return i + 1;
            }
        }
        PlusOne2 po = new PlusOne2Impl();
        System.out.println("result : " + po.plus(5));

        // 람다식에서의 this
        PlusOne2 po2 = i -> {
            System.out.println(this);
            return i + 1;
        };
        System.out.println("result : " + po2.plus(5));
    }
}

interface PlusOne2 {
    int plus(int i);
}