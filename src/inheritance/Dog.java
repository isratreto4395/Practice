package inheritance;

public class Dog extends Animal {
    String color;
    int age;
    String spots;
    String type;

    Dog (){

    }
    Dog (int age, String color, String spots, String type){
       this.age = age;
       this.color = color;
       this.spots = spots;
       this.type = type;
    }

    public void movement() {
        System.out.println("I only run when I want to");
        //we also can overiride the movement mehtod from animal class and change the result
    }


    public void sound(){
        System.out.println("I go woof woof");
    }

    public void hobby(){
        System.out.println("I chew furnitures");
    }
    public void eat(){
        System.out.println("I eat whatever my owner gives me");
    }
}

