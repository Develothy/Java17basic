package basic.study.mission;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class RandomPlayList {


    public static void main(String[] args) {
        List<String> playList = new ArrayList<>(asList("0.mp3","1.mp3","2.mp3","3.mp3","4.mp3","5.mp3","6.mp3","7.mp3","8.mp3","9.mp3"));
        List<Integer> last3 = new ArrayList<>(asList(-1, -1, -1));

        int playCnt = 20;

        for(int i = 0; i < playCnt ; i++){

            List<String> filteredList = playList.stream()
                    .filter(it -> !last3.contains(playList.indexOf(it)))
                    .collect(Collectors.toList());
            System.out.println("나오면 안되는 음악! " + last3);
            int randomMusic = (int)(Math.random() * filteredList.size());
            System.out.println( i + "번째 음악! " + filteredList.get(randomMusic));

            //last3 = Arrays.asList(playList.indexOf(filteredList.get(randomMusic)), last3.get(0), last3.get(1));
            last3.remove(last3.size() -1);
            last3.add(0, playList.indexOf(filteredList.get(randomMusic)));


/*          for문을 이용한 방식

            List<Integer> last4   = new ArrayList<>(asList(-1,-1,-1));
            for (;;) {
                int ran = (int) (Math.random() * 10 + 1);
                System.out.println("나오면 안되는 음악! : " + last4);
                if (!last4.contains(ran)) {
                    System.out.println(ran +" 음악~");
                    last4.remove(last4.size() - 1);
                    last4.add(0, ran);
                    break ;
                }
            }
*/
        }
    }
}
