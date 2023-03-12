package basic.study.chapter15;

public class HumanClone2 implements Cloneable{

    int age;
    String name;

    HumanClone2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
