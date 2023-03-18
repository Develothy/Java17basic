package basic.study.chapter18;

public class WildCardTest {

    static void printMan(GenericBox<? extends Human> box) {
        box.get().intro();
    }

    public static void main(String[] args) {

        Human h = new Human();
        GenericBox<Human> gh = new GenericBox<>(h);
        printMan(gh);

        Student s = new Student();
        GenericBox<Student> gs = new GenericBox<>(s);
        printMan(gs);

    }
}
