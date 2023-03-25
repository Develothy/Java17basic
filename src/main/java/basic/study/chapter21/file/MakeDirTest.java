package basic.study.chapter21.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeDirTest {

    public static void main(String[] args) throws IOException {
        File folder = new File("/Users/rothy/animal/java/basicStudy/basic17_test");
        if (folder.mkdir()) {
            File file = new File("/Users/rothy/animal/java/basicStudy/basic17_test/text2.txt");
            if (file.createNewFile()) {
                FileWriter out = new FileWriter(file);
                out.write("테스트 파일!");
                out.close();
            }
        }
    }
}
