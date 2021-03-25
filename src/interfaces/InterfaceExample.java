package interfaces;



public class InterfaceExample implements WaterBottleInterface {
    public static void main(String[] args) {
        System.out.println(color);

        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();
        ex.pourOut();
    }

    @Override //everything in the interface has to be in the class.. so thats why we had to import this from the class
    public void fillUp() {
        System.out.println("It is filled");
    }

    @Override
    public void pourOut() {
        System.out.println("It is poured out");
    }
}
