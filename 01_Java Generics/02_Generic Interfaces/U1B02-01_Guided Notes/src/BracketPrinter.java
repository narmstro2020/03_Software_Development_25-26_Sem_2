class BracketPrinter<T> implements Printer<T> {
    @Override
    public String format(T value) {
        return "[" + value + "]";
    }
}
