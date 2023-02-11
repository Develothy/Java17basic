package basic.study.chapter6;

public class Arithmetic1 {

    public static void main(String[] args) {

        int a = 6;
        float b = 4.0f;
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));    // 자동 형변환 (업 캐스팅)
        System.out.println(a + " / " + b + " = " + ((float) a / b));
        System.out.println(a + " / " + b + " = " + (int)( a / b));      // 명시적 형변환 (다운 캐스팅)


        System.out.println("나머지 값 구하기");
        System.out.println("6 %% 4 = " + 6 % 4);
        System.out.println("7 %% 3 = " + 7 % 3);
        System.out.println("5.0 %% 2.3 = " + 5.0 % 2.3);
        System.out.println("14 %% 2 = " + 14 % 2);
        System.out.println("15 %% 2 = " + 15 % 2);

        int value = 5;
        String str = value % 2 == 0 ? "짝" : "홀";


        String str2 = switch (value % 2) {
            case 0 -> "짝";
            case 1 -> "홀";
            default -> "-";
        };

        switch (value % 2) {
            case 0:
                str2 = "짝";
                break;
            case 1:
                str2 = "홀";
                break;
        }


    }
}
