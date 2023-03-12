package basic.study.chapter15;

public class HumanClone2Test {

    public static void main(String[] args) {

        HumanClone2 lee = new HumanClone2(29, "이우림");
        HumanClone2 lee2 = (HumanClone2) lee.clone();

        lee2.name = "이히히";

        System.out.println("lee.name : " + lee.name);
        System.out.println("lee2.name : " + lee2.name);
    }
}
