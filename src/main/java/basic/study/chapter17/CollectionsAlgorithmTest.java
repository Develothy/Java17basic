package basic.study.chapter17;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsAlgorithmTest {

    public static void main(String[] args) {

        //sortTest();
        shuffleTest();
    }

    static void sortTest() {

        ArrayList<String> arName = makeList();

        for (String name : arName) {
            System.out.print(name + " ");
        }

        System.out.println();
        Collections.sort(arName);
        // 역순 Collections.reverse()
        System.out.println(arName);

    }

    static void shuffleTest() {

        ArrayList<String> arName = makeList();

        for (String name : arName) {
            System.out.print(name + " ");
        }

        System.out.println();
        Collections.shuffle(arName);
        System.out.println(arName);

    }

    static ArrayList makeList() {
        ArrayList<String> arName = new ArrayList<>();
        arName.add("장보고");
        arName.add("김유신");
        arName.add("강감찬");
        arName.add("을지문덕");
        return arName;
    }
}
