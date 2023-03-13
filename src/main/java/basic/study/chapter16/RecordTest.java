package basic.study.chapter16;

public class RecordTest {

    public static void main(String[] args) {

        // recordTest1();
        recordTest2();
    }

    static void recordTest2() {

        PointRecord pr = new PointRecord(-100, 150);    // 유효성 검사로 음수 -> 0
        PointRecord pr2 = getMidPoint(pr);
        System.out.println(pr2);
    }

    static PointRecord getMidPoint(PointRecord pr) {
        return new PointRecord(pr.x() / 2, pr.y() / 2);
    }

    static void recordTest1() {
        // 생성
        PointRecord pr = new PointRecord(123, 456);
        // 문자열화 출력
        System.out.println(pr);

        // 개별 멤버값 읽기
        int x = pr.x();
        int y = pr.y();
        System.out.println("x = " + x + ", y = " + y);

        // 상등비교
        Point pr2 = new Point(123, 456);
        System.out.println(pr.equals(pr2));
    }
}
