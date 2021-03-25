package oop.abstraction;

public interface Car {
    String brand="Mercedes";
    int carQuantity=200;
    String sear ="2";
    String headLight="4";
    boolean gasTank=true;

    // Method Declare: Abstract
    public void startCar();
    public void stopCar();
    public void wheelCar();
    public void engineCar();
    public void accelerationCar();
    public void steeringCar();
    public void brakeCar();
    public void navigation();


    public static int carDoor(int doorNumber){
        int totalDoor= 1*doorNumber;
        System.out.println("Total Door "+totalDoor);
        return totalDoor;
    }
}
