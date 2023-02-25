package basic.study.chapter11;

public class Human {
    int age;
    String name;
    NoteBook book;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Human (float birth, String name) {
        this(0, name);
        java.time.LocalDate now = java.time.LocalDate.now();
        this.age = now.getYear() - (int) birth + 1;
    }
    public Human (int age, String name, String CPU, int memory, int storage) {
        book = new NoteBook(CPU, memory, storage);
        this.age = age;
        this.name = name;
    }

    public void intro() {
        System.out.println("안녕, " + age + "살 " + name + "입니다~");
        //System.out.print("나의 노트북 : ");
        //book.printSpec();
    }
}
