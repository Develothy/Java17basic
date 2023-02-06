package basic.study.chapter5;

public class WhileTest13 {

    public static void main(String[] args) {

        int filesize = 720;
        int download = 0;

        while (download < filesize) {
            download += 120;
            System.out.println(download + "K 다운로드 중...");
        }
        System.out.println("다운로드 완료");

        /*
         * for문 사용할 경우
        for (download = 0; download < filesize; ) {
            download += 120;
            System.out.println(download + "K 다운로드 중...");
        }
        */
    }
}
