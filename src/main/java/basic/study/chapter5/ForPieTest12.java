package basic.study.chapter5;

public class ForPieTest12 {

    public static void main(String[] args) {

        double pie = 0;
        boolean plus = true;

        // 1
        for (int deno = 1; deno < 1000; deno = deno + 2) {
            if (plus) {
                pie = pie + 1.0/deno;
                plus = false;
            } else {
                pie = pie - 1.0/deno;
                plus = true;
            }
        }
        pie *= 4;
        System.out.println("pie : " + pie);
        System.out.println();


        // 2
        pie = 0;
        int sign = 1;
        for (int deno = 1; deno < 1000; deno = deno + 2) {
            pie = pie + (1.0 / deno) * sign;
            sign = -sign;
        }
        pie = pie * 4;
        System.out.println("pie : " + pie);
        System.out.println();


        // 3
        pie = 0;
        for (int deno = 1; deno < 1000; deno = deno + 4) {
            pie = pie + (1.0 / deno) - (1.0 / (deno + 2));
        }
        System.out.println("pie : " + pie * 4);
        System.out.println();


        // 4
        for (int end = 10; end <= 10000000; end = end * 10) {
            pie = 0;
            for (int deno = 1; deno < end; deno = deno + 4) {
                pie = pie + (1.0 / deno) - (1.0 / (deno + 2));
            }
            System.out.println("pie : " + pie * 4 + "(" + end + "회)");
        }
        System.out.println();


        // 5
        pie = 0;
        for (int deno = 1; deno < 1000; deno++) {
            pie = pie + (1.0 / (deno * deno));
        }
        pie = Math.sqrt(pie * 6);
        System.out.println("pie : " + pie);


        // 6
        for (int end = 10; end <= 10000000; end = end * 10) {
            pie = 0;
            for (long deno = 1; deno < end; deno++) {
                pie = pie + (1.0 / (deno * deno));
            }
            pie = Math.sqrt(pie * 6);
            System.out.println("pie : " + pie + "(" + end + "회)");
        }
    }
}