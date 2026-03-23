
public class BallRefill extends Refill {

    public BallRefill(String color) {
        super(color , PenType.BALLPOINT);
    }

    @Override
    public void write(String text) {
        System.out.println("Writing Using a " + getColor() + " BALL Pen.");
        System.out.println("Content -> "+text);
    }
}
