package inheritance;

public class MainClass {
    public static void main(String[] args) {

       //Animal a = new Animal();
       // so I cannot make a object of the animal class becasue it is abstract
        //to acess it, it must be inherited from another class

//        Animal.
//        a.eat();
//        a.movement();
//        a.sound();

        System.out.println("__________________________________________________________________");


        Monkey m = new Monkey();
        m.eat();
        m.live();
        m.sound();
        m.movement();

        System.out.println("__________________________________________________________________");

        Dog d = new Dog(3, "Black", "white", "Bull Dog");
        System.out.println("I am a " + d.age + " years old " + d.color +" "+ d.type + " with "+ d.spots + " spots" );

        d.eat();
        d.sound();
        d.hobby();
        d.movement();

        System.out.println("__________________________________________________________________");
//
   }
}
//        Tamarin tam = new Tamarin();
//        tam.live();
//        tam.sound();