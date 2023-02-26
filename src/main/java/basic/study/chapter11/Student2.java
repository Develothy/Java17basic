package basic.study.chapter11;

public class Student2 {

    Human human;
    int stnum;
    String major;

    Student2 (int age, String name, int stnum, String major) {
        human = new Human(age, name);
        this.stnum = stnum;
        this.major = major;
    }
}
