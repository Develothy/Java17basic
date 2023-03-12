package basic.study.chapter15;

public class HumanClone {

    int age;
    String name;

    HumanClone(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object clone() {
        return new HumanClone(age, name);
    }
}
