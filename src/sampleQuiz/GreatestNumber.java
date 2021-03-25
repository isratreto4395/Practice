package sampleQuiz;

public class GreatestNumber {

    public static double largest(double x, double y, double z){
        return Math.max(Math.max(x,y),z);

    }


    public static void main(String[] args) {
        GreatestNumber.largest(35,78,87);

        int num1 = 35;
        int num2 = 78;
        int num3 = 87;
        if (num1 >= num2) {

            if (num1 >= num3) {
                System.out.println(num1 + " is the largest Number");
            } else {

                System.out.println(num3 + " is the largest Number");
            }}else {

                if (num2 >= num3) {

                    System.out.println(num2 + " is the largest Number");
                } else

                    System.out.println(num3 + " is the largest Number");
            }
        }
    }
