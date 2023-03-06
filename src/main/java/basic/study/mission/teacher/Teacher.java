package basic.study.mission.teacher;

public class Teacher implements Certificate, Job{

    String name;
    String student;
    String licence;
    String belong;
    int pay;
    int termYear;

    Teacher(String name, String student, String licence, String belong, int Pay, int termYear){
        this.name = name;
        this.student = student;
        this.licence = licence;
        this.belong = belong;
        this.pay = pay;
        this.termYear = termYear;
    }

    @Override
    public void learning() {
        System.out.println("교육 연수원에서 연수를 받습니다!");
    }

    @Override
    public void getLicence() {
        System.out.println("교육대학교 과정을 이수합니다!");
    }

    @Override
    public String work() {
        return "학생을 가르칩니다!";
    }

    @Override
    public void receiveMoney() {
        System.out.println("월급을 받습니다!");
    }

}
