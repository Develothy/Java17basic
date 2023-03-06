package basic.study.chapter13;

public interface Unit {

    // 인터페이스의 상수 포함. public static final이 생략된 것
    int HEALTH = 500;

    void move();
    void attack();

    // 디폴트 메서드
    default void die() {
        System.out.println("꽥꼬닥!");
    }

    // 스태틱 메서드
    static void moveAttack(Unit unit) {
        unit.move();
        unit.attack();
    }

    // 인터페이스의 메서드()는 모두 public abstract (생략)
    // 자식이 재정의 해야하니 final 메서드도 안된다.
    // 상수는 포함할 수 있다.
}
