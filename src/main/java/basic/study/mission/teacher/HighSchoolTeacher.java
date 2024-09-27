package basic.study.mission.teacher;

public class HighSchoolTeacher extends SubjectTeacher{

    int grade;

    HighSchoolTeacher(String name, String student, String licence, String belong, int Pay, int termYear, String subject, int grade) {
        super(name, student, licence, belong, Pay, termYear, subject);
        this.grade = grade;
    }

    public void selfStudyMonitoring() {
        System.out.println("오늘은 야자 감독입니다!");
    }


}
