package basic.study.chapter12;

public class InstanceOf3 {

    public static void main(String[] args) {
        Dog momo = new Dog();
        testAnimal(momo);

        Dove donald = new Dove();
        testAnimal(donald);
    }

    static void testAnimal(Animal animal) {
        animal.move();
        if (animal instanceof Dog mydog) {
            mydog.bark();
        }
        if (animal instanceof Dove mydove) {
            mydove.fly();
        }
    }
}
