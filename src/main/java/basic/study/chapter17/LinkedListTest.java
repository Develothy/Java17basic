package basic.study.chapter17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {

        //arrayListForLoop();
        //arrayListIterator();
        linkedListIterator();

    }

    static void arrayListForLoop() {
        LinkedList<String> arName = new LinkedList<>();
        arName.add("전두환");
        arName.add("김영삼");
        arName.add("김대중");
        arName.add("노태우");

        for (String s : arName) {
            System.out.println(s + " ");
        }
    }

    static void arrayListIterator() {
        ArrayList<String> arName = new ArrayList<>();
        arName.add("전두환");
        arName.add("김영삼");
        arName.add("김대중");
        arName.add("노태우");

        ListIterator<String> it = arName.listIterator(arName.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }

    static void linkedListIterator() {
        LinkedList<String> arName = new LinkedList<>();
        arName.add("전두환");
        arName.add("김영삼");
        arName.add("김대중");
        arName.add("노태우");

        ListIterator<String> it = arName.listIterator(arName.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
