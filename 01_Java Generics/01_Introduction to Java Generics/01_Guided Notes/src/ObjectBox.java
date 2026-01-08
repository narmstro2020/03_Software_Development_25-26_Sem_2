// ------------------------------------------------------------
// PART A: Before generics (Object + casting)
class ObjectBox {
    private Object value;

    public void set(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }
}
