package basic.study.chapter11;

class NoteBook {
    final String CPU;
    int memory;
    int storage;

    NoteBook(String CPU, int memory, int storage) {
        this.CPU = CPU;
        this.memory = memory;
        this.storage = storage;
    }

    void upgrade(int memory, int storage) {
        this.memory = memory;
        this.storage = storage;
    }

    void printSpec() {
        System.out.print("CPU= " + CPU);
        System.out.print(", memory= " + memory);
        System.out.println(", storage= " + storage);
    }
}
