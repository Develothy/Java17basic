package basic.study.chapter7;

public class Lookup16 {

    public static void main(String[] args) {

        int rank = 2;
        String[] message = {
                "",
                "최고의 성적입니다. 축하합니다.",
                "우수한 성적입니다.",
                "보통입니다.",
                "다소 부진합니다. 더 노력하세요.",
                "ㅠㅠ",
        };
        System.out.println(message[rank]);

        int score = 5;
        int[] rank2 = {5,1,1,3,1,2,4};
        System.out.println(message[rank2[score]]);

    }
}
