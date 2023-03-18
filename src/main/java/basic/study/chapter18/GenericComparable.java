package basic.study.chapter18;

public class GenericComparable {

    // comparable 비교연산 인터페이스를 구현한 T들만 인수로 가능
    static <T extends Comparable<T>> T max(T a, T b) {

        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}
