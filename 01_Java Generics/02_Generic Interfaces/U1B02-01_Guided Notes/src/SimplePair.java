// Implementation stays generic (pattern C)
class SimplePair<A, B> implements Pair<A, B> {
    private final A a;
    private final B b;

    public SimplePair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public A first() {
        return a;
    }

    @Override
    public B second() {
        return b;
    }
}
