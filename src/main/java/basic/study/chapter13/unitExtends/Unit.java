package basic.study.chapter13.unitExtends;

abstract class Unit {

    abstract void move();
    abstract void attack();

// 위 처럼 추상클래스화 시켜서 정의하지 않고 멤버로 포함만 시킴
//    void move() {
//        System.out.println("이동");
//    }
//
//    void attack() {
//        System.out.println("공격!!");
//    }
}
