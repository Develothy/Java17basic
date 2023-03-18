package basic.study.chapter17;

public class Human {

    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int hashCode() {
        return name.length() + age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Human) {
            Human other = (Human) obj;
            return (age == other.age && name.equals(other.name));
        } else {
            return false;
        }
    }
}
