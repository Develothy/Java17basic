package basic.study.chapter24;

public class MapTest {

    public static void main(String[] args) {
        //mapTest();
        distinctMapTest();
    }

    static void mapTest() {
        Data.nara.stream()
                .map(c -> c.name)
                .forEach(c -> System.out.print(c + " "));
    }

    static void distinctMapTest() {
        Data.nara.stream()
                .map(c -> c.cont)
                .distinct()
                .forEach(System.out::println);
    }
}
