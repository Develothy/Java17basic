package basic.study.chapter11;

public class Student extends Human {
    int stnum;
    String major;

    public Student(int age, String name, int stnum, String major) {
        super(age, name);
        this.stnum = stnum;
        this.major = major;
    }
    public Student(float birth, String name, int stnum, String major) {
        super(birth, name);
        this.stnum = stnum;
        this.major = major;
    }

    @Override  // 부모 메서드 재정의
    public void intro() {
        System.out.println(major + "학과 " + stnum+ "학번 "+ name+ "입니다~");
    }

    void study() {
        System.out.println("하늘천 따지 검을현 누를황");
    }
}
