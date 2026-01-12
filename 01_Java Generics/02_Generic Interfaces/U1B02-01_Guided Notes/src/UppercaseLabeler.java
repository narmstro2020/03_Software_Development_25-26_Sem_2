// Implementation chooses concrete type (pattern B)
class UppercaseLabeler implements Labeler {
    @Override
    public String label(String input) {
        return input.toUpperCase();
    }
}
