package constructor;

public class Main_Class_Construct {
    public static void main(String[] args) {

        Shirt_constructor.sleeves = "Long";
        System.out.println(Shirt_constructor.sleeves);


        Shirt_constructor.putOn();




   Shirt_constructor shirt = new Shirt_constructor("white",'l',"Bangladesh", 8.87);//first constructor

        shirt.putOn();
        shirt.takeOff();
        System.out.println("The " + "" + shirt.size + " " + shirt.color + "shirt is " + "$" +shirt.price + ". " + "Made in " + shirt.make );

        System.out.println("________________________________________________________");

        Shirt_constructor shirt2 = new Shirt_constructor("Pink");
        System.out.println("The color of the shirt is " + shirt2.color);

        System.out.println("________________________________________________________");

        Shirt_constructor shirt3 = new Shirt_constructor('M', 10.50);
        System.out.println("Size " +  shirt3.size + " is " + shirt3.price);

       /* System.out.println(shirt.price);
        System.out.println(shirt.color);
        System.out.println(shirt.make);
        System.out.println(shirt.size); */
    }

}
