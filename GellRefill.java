
public class GellRefill extends Refill {

    public GellRefill(String color) {
        super(color , PenType.GELL);
    }

    @Override
    public void write(String text) {
        System.out.println("Writing Using a " + getColor() + " GEL Pen.");
        System.out.println("Content -> "+text);
    }
}
