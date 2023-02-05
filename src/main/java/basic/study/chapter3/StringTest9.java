package basic.study.chapter3;

public class StringTest9 {
    public static void main(String[] args) {
        String str = "대한민국";
        System.out.println(str);

        String str2 = """
                아름다운 이땅에 금수 강산에
                단군할아버지가 "터" 잡으시고
                '弘益人間' 뜻으로 나라 세우니
                대대손손 훌륭한 인물도 많아.
                """;
        System.out.println(str2);

        String human = """
                이름 : 이우림----
                나이 : 29-------
                직업 : 서비스개발팀
                """;

        String name = "이우림";
        String str3 = """
                안녕하세요.
                제 이름은\s""" + name +  """
                입니다.
                잘 부탁 드립니다.
                """;
        System.out.println(str3);
    }

}
