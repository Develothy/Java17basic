package basic.study.chapter23;

public class AgeCountTest2 {

    static  int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };

    public static void main(String[] args) {
        //System.out.println("over : " + count(new AgeOver()));
        //System.out.println("under : " + count(new AgeUnder()));

        System.out.println("over : " + count(new AgeFilter() {
            @Override
            public boolean isAgeOk(int age) {
                return ( age > 30 );
            }
        }));
        System.out.println("under : " + count(new AgeFilter() {
            @Override
            public boolean isAgeOk(int age) {
                return ( age < 30 );
            }
        }));

        // 람다식 사용
        System.out.println("over : " + count(a -> a > 30));
        System.out.println("under : " + count(a -> a < 30));

        System.out.println("29세 이상 : " + count(a -> a >= 29));
        System.out.println("30세가 아닌 : " + count(a -> a != 30));
        System.out.println("짝수 나이 : " + count(a -> a % 2 == 0));
        System.out.println("28~30 범위 : " + count(a -> a > 27 && a < 31));

    }

    static int count(AgeFilter op) {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (op.isAgeOk(arAge[i])) num ++;
        }
        return num;
    }

}

interface AgeFilter {
    boolean isAgeOk(int age);
}

class AgeOver implements AgeFilter {
    @Override
    public boolean isAgeOk(int age) {
        return ( age > 30 );
    }
}

class AgeUnder implements AgeFilter {
    @Override
    public boolean isAgeOk(int age) {
        return ( age < 30 );
    }
}
