package basic.study.chapter24;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Human lee = new Human(29, "이우림", "삼성 맥1");
        useBook(lee);

        Human lee2 = new Human(29, "이라라", null);
        useBook(lee2);
    }

    static void useBook(Human human) {


/*        human.book.filter(b -> b.model.indexOf("삼성") != -1)
                .ifPresent(b -> System.out.println("삼성 노트북"));*/

/*        String model = human.book.map(b -> b.model).orElse("이름 없음"); // 객체가 비어있을 경우 대체
        System.out.println(model);*/

/*        Notebook book = human.book.orElse(new Notebook("비싸다")); // 객체가 비어있을 경우 대체
        System.out.println("내 노트북 : " + book.model);*/

//        human.book.ifPresent(b -> System.out.println("내 노트북 : " + b.model));

/*        if (human.book.isPresent()) {
            System.out.println("내 노트북 : " + human.book.get().model);
        } else {
            System.out.println("노트북 없당~");
        }*/
    }

}

class Notebook {
    String model;
    Notebook(String model) {this.model = model;}
}
class Human {
    int age;
    String name;
    //Notebook book;
    Optional<Notebook> book;

    Human(int age,String name, String model) {
        //book = new Notebook(model);
        if (model == null || model.length() == 0) {
            book = Optional.empty();
        } else {
            book = Optional.of(new Notebook(model));
        }
        this.age = age;
        this.name = name;
    }
}