package basic.study.chapter15;

public class HumanDeepCloneTest {

    public static void main(String[] args) {

        HumanDeepClone ha = new HumanDeepClone(29, "하도영");
        HumanDeepClone ha2 = (HumanDeepClone) ha.clone();

        ha2.score[0] = 999;
        System.out.println("ha.score[0] : " + ha.score[0]);
        System.out.println("ha2.score[0] : " + ha2.score[0]);
    }
}
