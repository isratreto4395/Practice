package inheritance;

public abstract class Animal {
    //If a class have abstract methods, then the class should also be abstract using abstract keyword, else it will not compile

    protected String sex;
    private char hair;
    char tail;
    String type;
    int age;

    public abstract void sound();// abstract method with no body becasue not all animal make the same sound


    public abstract void eat();// A method without body (no implementation) is known as abstract method.
    // A method must always be declared in an abstract class
//Abstract class in java can’t be instantiated


    public void movement(){
        System.out.println("I run like the wind");
    }
    
}
