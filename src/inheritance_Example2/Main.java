package inheritance_Example2;

public class Main {
    public static void main(String[] args) {


        BasicCalculator bcalc1 = new BasicCalculator();
        System.out.println(bcalc1.add(10,20));
        System.out.println(bcalc1.subtraction(10,20));

        System.out.println(">_>_>_>_>_>_>_>_>");

        ScientificCalculator scalc1 = new ScientificCalculator();
        System.out.println(scalc1.add(10,20));
        System.out.println(scalc1.subtraction(10,20));
        System.out.println(scalc1.sin(90));

        System.out.println("-_- -_- -_- -_- -_- -_- ");

        BasicCalculator bcalc2 = new ScientificCalculator();
        // this works because scientific calc is in relation with basiccalc
        //derived class object can handle all the calls made through base class reference variable
        System.out.println(bcalc2.add(10,20));
        System.out.println(bcalc2.subtraction(10,20));
        System.out.println(((ScientificCalculator)(bcalc2)).sin(90));



    }
}