package basic.study.mission.teacher;

public class TeacherTest {

    public static void main(String[] args) {
        Teacher[] teachers = {
            new Teacher("김미나", "초등학생", "교원자격증", "떡잎초등학교", 300, 3),
            new SubjectTeacher("박보검", "이우림 학생", "없음", "프리랜서", 100, 1, "화학"),
            new HighSchoolTeacher("이우림", "고등학생", "교원자격증", "성수고등학교", 400, 4, "생명", 3),
            new Professor("한광식", "해리포터", "박사학위 취득", "호그와트", 500, 5, "마법", "매직쇼랩실", "헤르미온느"),
        };

        teacher(teachers);
    }

    public static void teacher(Teacher[] teachers) {

        for (Teacher teacher : teachers) {
            String resume ="""
                ===============================\n"""+ teacher.work()+ """
                \n이름 :\s""" + teacher.name + """
                \n소속 :\s""" + teacher.belong + """
                \n경력 :\s""" + teacher.termYear + """
                년\n자격 :\s""" + teacher.licence + """
                \n===============================
                """;
            System.out.println(resume);
        }

    }
}
