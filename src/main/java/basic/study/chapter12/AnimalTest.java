package basic.study.chapter12;

public class AnimalTest {

    public static void main(String[] args) {

        // 타입이 일치한 경우
        Animal animal = new Animal();
        animal.move();

        // 부모 타입에 자식 객체 대입
        Animal dog = new Dog();
        dog.move();
        // dog.bark(); 안됨

        // 타입이 일치
        Dog dog2 = new Dog();
        dog2.move();
        dog2.bark();

        /*
         * 자식 타입에 부모객체 대입
         * 다운캐스팅 해야함
        Dove dove = new Animal();
        Dove dove = (Dove) new Animal();
        dove.fly();
        */
    }
}
