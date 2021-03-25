package example1_By_Hubby;

import java.util.Scanner;

public class Work_Schedule {

    Scanner schedule = new Scanner(System.in); // global varible, so i can acess this from any methods in the class

    public void userInput(){
        System.out.println("Input day: ");
        System.out.println("S- Saturday");
        System.out.println("Su- Sunday");
        System.out.println("M- Monday");
        System.out.println("T- Tuesday");
        System.out.println("W- Wednesday");
        System.out.println("Th- Thursday");
        System.out.println("F- Friday");
        String day = schedule.nextLine();

        if(day.equals("S")){
            System.out.println("Yay! You don't have work today");
        }else if (day.equals("Su")){
            System.out.println("Yay! You don't have work today");
        }else if (day.equals("M")) {
            System.out.println("Unfortunately! this is just the first day of work");
        } else if (day.equals("T")) {
            System.out.println("You still have work. Its only Tuesday!!");
        }else if (day.equals("W")){
            System.out.println("You still have work but the bright side is you only have 3 more days to go");
        }else if (day.equals("Th")){
            System.out.println("Work work work");
        }else if (day.equals("F")){
            System.out.println("pheww!! one more day of work then you are off");
        } else{
            System.out.println("Please input as instructed");
        }

    }


}
