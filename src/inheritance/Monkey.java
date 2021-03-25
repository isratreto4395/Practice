package inheritance;



public class Monkey extends Animal {

    //we didnt make the child class abstract so we must include the abstract methods of the parent class

    public void eat (){

    System.out.println("I eat bananas");
    //The subclass of abstract class in java must implement all the abstract methods
        // unless the subclass is also an abstract class
}


    public void sound() {
        System.out.println("I make oooo ahhh ahhh sound");
    }

    public void movement(){
// we r overriding here- polymorphism
        System.out.println("I climb");

    }
// we used polymorphism which is overriding. we override live in animal.


    public void live(){
        System.out.println("I live in the jungle");
    }


    //animal class doesnt have this method. so we r able to attend new methods in child class

}

