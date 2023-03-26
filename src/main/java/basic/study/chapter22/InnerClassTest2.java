package basic.study.chapter22;

public class InnerClassTest2 {

    public static void main(String[] args) {

        Human2 lee = new Human2(29, "리무", "리");
        lee.intro();
        lee.name.outAge();

        // inner class new
        Human2.Name2 name = lee.new Name2("라라", "리");
        System.out.println("변경된 이름 : " + name.first + name.family);
        name.outAge();
    }
}



class Human2 {
    int age;
    Name2 name;
    class Name2 {
        String first;
        String family;

        Name2(String first, String family) {
            this.first = first;
            this.family = family;
        }

        void outAge() {
            System.out.println("저는 " + age + "살 입니다.");
        }
    }
    Human2(int age, String first, String family) {
        this.age = age;
        this.name = new Name2(first, family);
    }

    void intro() {
        System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
    }
}
