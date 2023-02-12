package basic.study.mission;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cache {

    private static Map<Integer, Integer> cache = new HashMap<>();

    //@Cacheable(value = "calc")
    public static int calc(int value) throws InterruptedException {

        if (!cache.isEmpty() && cache.containsKey(value)) {
            return cache.get(value);
        }

        TimeUnit.SECONDS.sleep(3);
        cache.put(value, value *= 100000);
        return value;
    }


    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        int num;

        for (int i = 0; i <= 10; i++) {

            System.out.println("숫자를 입력하세요(1 ~ 10) : " + i);
            while (!sc.hasNextInt()) {
                System.out.println("숫자만 입력해주세요!! 다시!");
                sc.next();
            }
            num = sc.nextInt();
            System.out.println("호출 시간 : " + ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS")));
            System.out.println(calc(num));
            System.out.println("응답 시간 : " + ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS")));

        }
        sc.close();

    }
}