package basic.study.chapter18;

public class GenericBox<T> {

    T value;

    GenericBox(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    void set(T value) {
        this.value = value;
    }
}
