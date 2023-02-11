package basic.study.chapter10;

public class RangeTest {

    public static void main(String[] args) {
        Range range = new Range(2, 6);
        range.outRange();
        range.setFrom(8);
        range.outRange();

    }
}
