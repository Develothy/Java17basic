package basic.study.chapter10;

public class NoteBook {

    final String CPU;
    int memory;
    int storage;
    public final static long GIGA = 1073741824L;    // 상수니까 외부로 공개해서 사용해보자

    public NoteBook(String CPU, int memory, int storage) {
        this.CPU = CPU;
        this.memory = memory;
        this.storage = storage;
    }

    public void upgrade(int memory, int storage) {
        this.memory = memory;
        this.storage = storage;
        // this.CPU = "Super String 16 Core 8.5GHz";     // 상수라 변경 불가
    }

    public void printSpec() {
        System.out.print("CPU= "+CPU);
        System.out.print(", memory= "+memory);
        System.out.println(", storage= "+storage*GIGA +"바이트");
    }

}
