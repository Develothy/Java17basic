package basic.study.chapter13.multiInherit;

public class SuperInterface {

    interface A {
        default void print() {
            System.out.println("A 인터페이스에서 인쇄한다.");
        }
    }
    interface B {
        default void print() {
            System.out.println("B 인터페이스에서 인쇄한다.");
        }
    }
    class C implements A, B {

        // A와 B의 디폴트 메서드 print() 즁 어떤게 호출될지 난해하니 재정의를 꼭 해야함
        public void print() {
            A.super.print();
        }
    }


}
