package constructor;

public class Shirt_constructor {

    public String color;
    public char size;
    public String make;
    public double price;

    static String sleeves;// //wihout public, i am able to access it in different classes within the same package.
    // so try to access it in another class

    public static int sleeve_size;
    ////making it public, i am able to access it in different package in the samae project
    //so create another package inside the same package and try to access it






     Shirt_constructor(String newColor, char newSize, String newMake, double newPrice){
         color = newColor;
         size = newSize;
         make = newMake;
         price = newPrice;
     }
     Shirt_constructor(String newColor){
       color = newColor;
     }
     Shirt_constructor(char newSize, double newPrice){
         size = newSize;
         price = newPrice;
     }


     public static void putOn(){
         System.out.println("SHIRT IS ON");
     }
     public void takeOff(){
         System.out.println("SHIRT IS OFF");

     }
}

