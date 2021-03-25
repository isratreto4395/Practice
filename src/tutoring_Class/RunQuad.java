package tutoring_Class;

import java.util.Scanner;

public class RunQuad {
    public static void main(String[] args) {

        //part 2 of the question

        Square sq = new Square();
        Rectangle rec = new Rectangle();
        Parallelogram pa = new Parallelogram();
        Rhombus rh = new Rhombus();
        Trapezoid tr = new Trapezoid();

        Scanner input = new Scanner(System.in);
        System.out.println("Select from the following: ");
        System.out.println("R - Rectangle");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");
        String x = input.nextLine();

        if (x.equals("R")) {
            System.out.println("A rectangle: ");
            rec.showDescription();
        } else if (x.equals("S")) {
            System.out.println("A square: ");
            sq.showDescription();

        } else if (x.equals("P")){
            System.out.println("A parallelogram: ");
            pa.showDescription();
        }else if (x.equals("H")){
            System.out.println("A rhombus: ");
            rh.showDescription();
        }else if (x.equals("T")){
            System.out.println("A trapezoid: ");
            tr.showDescription();
        }
        else {
            System.out.println("Invalid Input-Press R or S");
        }
    }


    }



//Quadrilateral qd = new Quadrilateral();

//part 1 of the question

       /* Square sq = new Square();
        Rectangle rec = new Rectangle();

        Scanner input = new Scanner(System.in);
        System.out.println("Press R for Rectangle or S for Square");
        String x = input.nextLine();

        if (x.equals("R")) {
            System.out.println("A rectangle: ");
            rec.showDescription();
        } else if (x.equals("S")) {
            System.out.println("A square: ");
            sq.showDescription();

        } else {
            System.out.println("Invalid Input-Press R or S");
        }
    }*/