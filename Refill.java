
public abstract class Refill {

    private final String color;
    private final PenType penType;

    public Refill(String color, PenType penType) {
        this.color = color;
        this.penType = penType;
    }

    public String getColor() {
        return this.color;
    }

    public PenType getPenType() {
        return penType;
    }

    public abstract void write(String text);

}
