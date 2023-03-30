package basic.study.chapter24;

public class FilterTest {

    public static void main(String[] args) {
        filterTest();
    }

    static void filterTest() {
        Data.nara.stream()
                .filter(c -> c.oecd)
                .forEach(System.out::println);
    }
}
