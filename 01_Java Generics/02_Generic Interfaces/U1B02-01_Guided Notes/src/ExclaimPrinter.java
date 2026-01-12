class ExclaimPrinter implements Printer<String> {
    @Override
    public String format(String value) {
        return value + "!!!";
    }
}
