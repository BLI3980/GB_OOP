public abstract class Shield {
    public abstract int protection();

    @Override
    public String toString() {
        return String.format("Shield provides %d protection",
                protection());
    }
}
