public class Main {
    public static void main(String[] args) {
        
        System.out.println("-----BUILDING PEN-----");
        
        Pen gelPen = new Pen(PenType.GELL, new GellRefill("BLUE"), new ClickMechanism());

        gelPen.start();
        gelPen.write("Hello from the Gel Pen!");
        
        gelPen.changeRefill(new GellRefill("BLACK"));
        gelPen.write("Now writing in Black Gel.");

        gelPen.changeRefill(new BallRefill("RED")); 
        
        gelPen.close();

        Pen fountainPen = new Pen(PenType.INK, new InkRefill("BLACK"), new CapMechanism());

        fountainPen.start();
        fountainPen.write("Hello from the Fountain Pen!");
        fountainPen.close();
        
    }
}