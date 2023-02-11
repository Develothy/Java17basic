package basic.study.chapter9;

public class Init {

    String field = "명시적 초기화";

    {
        field = "초기화 블록";
    }

    Init() {
        field = "생성자";
    }
}
