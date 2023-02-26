package basic.study.chapter12;

public class AnimalTest2 {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();

        // 업캐스팅
        Animal up = (Animal) dog;
        up.move();
        //up.bark();

        // 다운캐스팅
        Dog down = (Dog) animal;
        down.move();
        down.bark();
    }
}
