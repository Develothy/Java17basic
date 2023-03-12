package basic.study.chapter15;

public class Clone2 {

    public static void main(String[] args) {

        HumanClone lee = new HumanClone(29, "이우림");
        HumanClone lee2 = (HumanClone) lee.clone();
        lee2.name = "이순신";

        System.out.println("lee.name : " + lee.name);
        System.out.println("lee2.name : " + lee2.name);
    }
}
