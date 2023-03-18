package basic.study.chapter18;

public class GenericBoundTypeTest {

    public static void main(String[] args) {

        Human h = new Human();
        GenericBoundType<Human> bh = new GenericBoundType<>(h);
        bh.intro();

        Student s = new Student();
        GenericBoundType<Human> bs = new GenericBoundType<>(s);
        bs.intro();
    }
}
