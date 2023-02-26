package basic.study.chapter12;

import basic.study.chapter11.Student;

class Graduate extends Student {

    String name;
    String thesis;

    Graduate(int age, String name, int stnum, String major, String thesis) {
        super(age, name, stnum, major);
        this.name = name;
        this.thesis = thesis;
    }

    public void intro() {
        System.out.println(thesis + "논문을 쓰고 있는 대학원생 " + name + "입니다.");
    }

}
