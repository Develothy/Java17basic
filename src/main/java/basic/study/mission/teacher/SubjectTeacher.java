package basic.study.mission.teacher;

public class SubjectTeacher extends Teacher{

    String subject;

    SubjectTeacher(String name, String student, String licence, String belong, int Pay, int termYear, String subject) {
        super(name, student, licence, belong, Pay, termYear);
        this.subject = subject;
    }

    public void publishedPaper() {
        System.out.println("논문을 발표합니다!");
    }

    @Override
    public void learning() {
        System.out.println("전공 과목을 연수합니다!");
    }

    @Override
    public void getLicence() {
        System.out.println("임용고시를 합격합니다!");
    }
}
