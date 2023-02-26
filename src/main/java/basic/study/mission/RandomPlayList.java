package basic.study.mission;

import java.util.*;

public class RandomPlayList {

    public static void main(String[] args) {

        playMusic(10, 20);
    }

    static void playMusic(int playListSize, int playCnt) {
        List<String> playList = makePlayList(playListSize);
        List<Integer> last3 = new LinkedList<>();

        for(int i = 0; i < playCnt ; i++) {

            System.out.println("나오면 안되는 음악! : " + last3);

            int musicNum;
            do {
                musicNum = (int) (Math.random() * playListSize);
            } while (last3.contains(musicNum));
            System.out.println(playList.get(musicNum) + " ~ ♬");

            if (last3.size() == 3) {
                last3.remove(last3.size() - 1);
            }
            last3.add(0, musicNum);

        }
    }

    static List<String> makePlayList(int playListSize) {
        List<String> playList = new ArrayList<>();

        for (int i = 0; i < playListSize; i++) {
            playList.add(i + ".mp3");
        }

        return playList;
    }

}
