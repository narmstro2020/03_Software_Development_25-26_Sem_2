// Generic interface with a default method
interface Printer<T> {
    String format(T value);

    default void print(T value) {
        System.out.println(format(value));
    }
}
