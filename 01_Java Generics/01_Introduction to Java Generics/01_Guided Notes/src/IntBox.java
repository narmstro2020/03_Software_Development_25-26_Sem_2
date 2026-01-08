// Two almost-identical “box” classes (yikes)
class IntBox {
    private int value;

    public IntBox(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }
}
