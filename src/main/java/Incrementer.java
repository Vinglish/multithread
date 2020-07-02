public class Incrementer {
    private static final int TOP = 100;
    private int position;

    public void increment() {
        position++;
    }

    public boolean isTop() {
        return position == TOP;
    }

    public int getPosition() {
        return position;
    }
}
