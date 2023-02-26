package basic.study.chapter12;

public class InstanceOf {

    public static void main(String[] args) {
        Dog momo = new Dog();
        testAnimal(momo);
    }

    static void testAnimal(Animal animal) {
        Dog mydog = (Dog) animal;
        mydog.move();
        mydog.bark();
    }
}
