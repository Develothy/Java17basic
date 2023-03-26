package basic.study.chapter22;

public class StaticInnerClass2 {

    public static void main(String[] args) {

    }
}
class Human6 {
    int field;
    static int staticField;

    // 내부 클래스는 외부의 모든 벱머를 액세스할 수 있다.
    class Name6 {
        void method() {
            field = 0;
            staticField = 0;
        }
    }

    // 정적 내부 클래스는 외부의 정적 필드만 엑세스할 수 있다.
    static class StaticName {
        void method() {
            // field = 0;
            staticField = 0;
        }
    }

    // 비정적 메서드는 내부, 정적 내부 클래스 모두 액세스할 수 있다.
    void method() {
        Name6 n = new Name6();
        StaticName sn = new StaticName();
    }

    // 정적 메서드는 내부 정적 클래스만 엑세스할 수 있다.
    static void staticMethod() {
        //Name6 n = new Name6();
        StaticName sn = new StaticName();
    }

}