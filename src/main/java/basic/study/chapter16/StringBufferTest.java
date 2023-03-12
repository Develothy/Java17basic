package basic.study.chapter16;

public class StringBufferTest {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        stringAssignTest(start);
        //stringBufferTest(start); //1.676955


    }
    static void stringAssignTest(long start) {
        String str = "";

        for (int i = 0; i < 5000; i++) {
            for (char ch = 'A'; ch <= 'z'; ch++) {
                str += ch;
            }
            str += '\n';
        }
        System.out.println(str);
        System.out.println(System.currentTimeMillis()-start/1000.0 + "초");
    }

    static void stringBufferTest(long start) {

        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 5000; i++) {
            for (char ch = 'A'; ch <= 'z'; ch++) {
                str.append(ch);
            }
            str.append('\n');
        }
        System.out.println(str);
        System.out.println(System.currentTimeMillis()-start/1000.0 + "초");
    }

}
