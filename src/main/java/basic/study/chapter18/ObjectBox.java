package basic.study.chapter18;

public class ObjectBox {

    Object value;

    ObjectBox(Object value) {
        this.value = value;
    }

    Object get() {
        return value;
    }

    void set(Object value) {
        this.value = value;
    }
}
