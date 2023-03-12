package basic.study.chapter15.boxing;

public class IntInfoTest {

    public static void main(String[] args) {
        System.out.printf("int 타입의 크기  = %d, 최솟값 = %d, 최댓값 = %d\n",
                Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.printf("short 타입의 크기  = %d, 최솟값 = %d, 최댓값 = %d\n",
                Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("Long 타입의 크기  = %d, 최솟값 = %d, 최댓값 = %d\n",
                Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.printf("Float 타입의 크기  = %d, 최솟값 = %d, 최댓값 = %d\n",
                Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);

        System.out.println(Integer.toBinaryString(1234));
    }
}
