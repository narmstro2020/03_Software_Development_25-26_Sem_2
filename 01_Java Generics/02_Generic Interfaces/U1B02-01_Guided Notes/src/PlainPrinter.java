class PlainPrinter<T> implements Printer<T> {
    @Override
    public String format(T value) {
        return String.valueOf(value);
    }
}
