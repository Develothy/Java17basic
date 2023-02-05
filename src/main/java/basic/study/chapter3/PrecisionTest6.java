package basic.study.chapter3;

public class PrecisionTest6 {
    public static void main(String[] args) {
        float f = 0f;

        for (int i=0; i<1000; i++) {
            f = f + 0.1f;
        }
        System.out.println(f);
    }
}
