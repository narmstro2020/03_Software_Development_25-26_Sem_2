// ------------------------------------------------------------
// PART B/C: Generic class Box<T>
class Box<T> {
    private T value;

    public Box() {
        // default: null
    }

    public Box(T value) {
        this.value = value;
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public boolean isEmpty() {
        return value == null;
    }
}
