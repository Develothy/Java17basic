package basic.study.chapter3;

public class RadixTest3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0x10;
        int c = 015;
        int d = 0b1001;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Long price = 123456789; 에러 'L' 생략 시 int로 간주
        Long price = 123456789L;
        Long price_ = 123_456_789L; // 언더바 허용
    }
}
