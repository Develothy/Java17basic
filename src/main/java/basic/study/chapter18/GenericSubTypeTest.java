package basic.study.chapter18;

import java.util.ArrayList;

public class GenericSubTypeTest {

    public static void main(String[] args) {

        ArrayList<Human> ah = new ArrayList<>();
        ArrayList<Student> as = new ArrayList<>();

        ah.add(new Human());
        as.add(new Student());
        ah.add(new Student());

        //ah = as;
        ah.add(new Human());

        //Student lee = as.get(1);

    }
}
