package basic.study.chapter16;

public class RecordOriginalTest {

    public static void main(String[] args) {

        // 생성
        Point pr = new Point(123, 456);
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
