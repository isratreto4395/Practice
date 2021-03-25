package nestedClass;

 //public static class Computer{
  class Computer{
    String computerName = "Samsung";
    static String computerPrice = "2000";

    public static void computerDisplay(){
        System.out.println("Computer Display");
    }
public static class Mobile{
        static String mobileBrand = "Samsung";
        int mobilePrice = 1200;
}

}

public class NestedClassExample2 {
    int num = 20;
    int num2 = 30;


    public static void main(String[] args) {
        NestedClassExample2 learn = new NestedClassExample2();
        System.out.println(learn.num);

        Computer.Mobile mobile = new Computer.Mobile();
        System.out.println(mobile.mobilePrice);


    }

}


