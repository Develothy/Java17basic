package basic.study.chapter15.boxing;

public class IntBoxTest {

    public static void main(String[] args) {

        // 정수형
        int i =1234;
        // Integer wrapint = new Integer(i); // 자제
        Integer wrapint = i; // 간편
        // Integer wrapint = Integer.valueOf(i);    // 권고. 같은 값에 대해서는 이미 생성된 래퍼를 돌려주어 메모리 절양
        String str = wrapint.toString();
        System.out.println(str);

        // 문자열
        Integer wrapint2 = Integer.valueOf("629");
        String str2 = wrapint2.toString();
        int i2 = Integer.parseInt(str2);
        System.out.println(i2);

        System.out.println("문자간 +, 정수간 + ");
        String a = "12";
        String b = "34";
        System.out.println("String a + b : " + a + b);
        System.out.println("parseInt a + b : " + Integer.parseInt(a) + Integer.parseInt(b));

    }

}
