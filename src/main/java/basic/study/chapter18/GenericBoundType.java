package basic.study.chapter18;

public class GenericBoundType<T extends Human> {

    T value;

    GenericBoundType(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    void set(T value) {
        this.value = value;
    }

    void intro() {
        value.intro();
    }
}
