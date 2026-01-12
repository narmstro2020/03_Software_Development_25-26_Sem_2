// Interface static method pattern: declare its own <T>
interface PrinterUtil {
    static <T> void printTwice(T value) {
        System.out.println(value);
        System.out.println(value);
    }
}
