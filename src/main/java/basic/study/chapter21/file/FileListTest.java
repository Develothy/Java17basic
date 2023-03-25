package basic.study.chapter21.file;

import java.io.File;

public class FileListTest {

    public static void main(String[] args) {
        File f = new File("/Users/rothy/animal/java/basicStudy/basic17_test");
        File[] arFile = f.listFiles();
        for (int i = 0; i < arFile.length; i++) {
            if (arFile[i].isFile()) {
                System.out.printf("%s %d 바이트\n", arFile[i].getName(), arFile[i].length());
            } else {
                System.out.printf("[%s] <폴더>\n", arFile[i].getName());
            }
        }
    }
}
