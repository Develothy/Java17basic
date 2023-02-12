package basic.study.mission;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class RandomPlayList {


    public static void main(String[] args) {
        List<String> playList = asList("0.mp3","1.mp3","2.mp3","3.mp3","4.mp3","5.mp3","6.mp3","7.mp3","8.mp3","9.mp3");
        List<Integer> last3   = asList(-1,-1,-1);

        int playCnt = 20;
        for(int i = 0; i < playCnt ; i++){

            /* 람다의 캡쳐링이 일어나게 되면 값을 참조가 아닌 람다의 새로운 스택을 생성, 스택의 변경된 값을 반영할 방법이 없음
             * 그래서 재정의되지 않는 변수만 가능..
             */

            List<Integer> last3Temp = last3;

            List<String> filteredList = playList.stream()
                    .filter(it -> !last3Temp.contains(playList.indexOf(it)))
                    .collect(Collectors.toList());
            System.out.println("나오면 안되는 음악! " + last3);
            int randomMusic = (int)(Math.random() * filteredList.size());
            System.out.println( i + "번째 음악! " + filteredList.get(randomMusic));

            last3 = Arrays.asList(playList.indexOf(filteredList.get(randomMusic)), last3.get(0), last3.get(1));

/*            List<Integer> last4   = asList(-1,-1,-1);

            for (;;) {
                int ran = (int) (Math.random() * 10 + 1);
                System.out.println("나오면 안되는 음악! : " + last4);
                if (!last4.contains(ran)) {
                    System.out.println(ran +" 음악~");
                    last4 = asList(ran, last4.get(0), last4.get(1));
                    break ;
                }
            }*/
        }
    }


}
