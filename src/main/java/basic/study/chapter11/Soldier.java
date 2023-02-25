package basic.study.chapter11;

public class Soldier extends Human {
    int milnum;

    public Soldier(int age, String name, int milnum) {
        super(age, name);
        this.milnum = milnum;
    }

    void fight() {
        System.out.println("따쿵 따쿵~ 앞으로 전진!");
    }
}
