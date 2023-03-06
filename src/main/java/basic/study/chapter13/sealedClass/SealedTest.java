package basic.study.chapter13.sealedClass;

public class SealedTest {

    public static void main(String[] args) {

        outLanguageName(new Java());
    }

    static void outLanguageName(Language lang) {

        if (lang instanceof Java) {
            System.out.println("자바");
        } else if (lang instanceof Cpp) {
            System.out.println("C++");
        } else if (lang instanceof CSharp) {
            System.out.println("C#");
        }
    }
}
