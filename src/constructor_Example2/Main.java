package constructor_Example2;

public class Main {
    public static void main(String[] args) {

        ComplexNumber num = new ComplexNumber();
        num.print();
        System.out.println("____________________________________________");

        ComplexNumber num2 = new ComplexNumber(1.2);
        num2.print();
        System.out.println("____________________________________________");

        ComplexNumber num3 = new ComplexNumber(4.67,8.98);
        num3.print();


    }
}
