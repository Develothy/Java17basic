package basic.study.chapter24;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamMethodTest {

    public static void main(String[] args) {
        //generateTest();
        //iterateTest();
        fileStreamTest();
    }

    static void fileStreamTest() {
        try {
            Stream<String> lines = Files.lines(Paths.get("abc.txt"));
            lines.forEach(System.out::print);
            lines.close();

            Stream<Path> list = Files.list(Paths.get("/Users/rothy/animal/java/basicStudy/basic17_test"));
            list.forEach(p -> System.out.println(p.getFileName()));
        } catch (Exception e) {;}

    }

    static void generateTest() {
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }

    static void iterateTest() {
        Stream.iterate(1, a -> a + 1)
                .limit(5)
                .forEach(System.out::print);
    }
}
