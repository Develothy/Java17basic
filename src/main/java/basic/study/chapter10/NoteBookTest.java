package basic.study.chapter10;

public class NoteBookTest {

    public static void main(String[] args) {

        NoteBook Sens = new NoteBook("IntelCore i7", 4, 500);
        NoteBook XNote = new NoteBook("AMD 라이젠", 2, 320);

        Sens.printSpec();
        XNote.printSpec();

        Sens.upgrade(8, 750);
        Sens.printSpec();
    }
}
