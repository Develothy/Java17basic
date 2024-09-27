package basic.study.mission.teacher;

public class Professor extends SubjectTeacher {

    String labName;
    String assistantName;

    Professor(String name, String student, String licence, String belong, int Pay, int termYear, String subject, String labName, String assistantName) {
        super(name, student, licence, belong, Pay, termYear, subject);
        this.labName = labName;
        this.assistantName = assistantName;
    }

    public void seasonlecture() {
        System.out.println("계절학기 강의를 진행중입니다.");
    }

    @Override
    public void learning() {
        System.out.println("학회에 참가합니다!");
    }

    @Override
    public String work() {
        return "강의 합니다!";
    }

    @Override
    public void getLicence() {
        System.out.println("박사과정을 수료합니다!");
    }

}
