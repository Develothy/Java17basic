package basic.study.chapter15;

public class HumanDeepClone implements Cloneable {

    int age;
    String name;
    int[] score = new int[] {1,2,3};

    HumanDeepClone(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object clone() {
        try {
            HumanDeepClone other = (HumanDeepClone) super.clone();
            other.score = this.score.clone();
            return other;
            // return super.clone(); // DeepClone 안됨
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
