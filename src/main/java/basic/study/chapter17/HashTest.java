package basic.study.chapter17;

import java.util.HashMap;

public class HashTest {

    public static void main(String[] args) {
        hashTest();
    }

    static void hashTest() {
        HashMap<String, Integer> snack = new HashMap<>();
        snack.put("오징어 땅콩", 2500);
        snack.put("죠리퐁", 1900);
        snack.put("핫브레이크", 450);
        snack.put("빼뺴로", 900);

        String mySnack = "죠리퐁";
        System.out.println(mySnack + "의 가격은 " + snack.get(mySnack));
    }
}
