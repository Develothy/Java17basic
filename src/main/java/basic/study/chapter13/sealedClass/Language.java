package basic.study.chapter13.sealedClass;

abstract sealed class Language permits Java, Cpp, CSharp {

    // permits 목록으로 상속 허용
    // final class Java extends Language {}
    // final class Cpp extends Language {}
    // final class CSharp extends Language {}

    // 상속 비허용 컴파일 에러
    // final class python extends Language {}

}
