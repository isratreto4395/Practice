package array.array2D;

public class Learn2DArray {
    public static void main(String[] args) {

        twoDArray();
    }

    public static void twoDArray(){
        String[][] age = new String[3][3];
        age[0][0]="Name";
        age[0][1]="State";
        age[0][2]="Salary";

        age[1][0]="Shawn";
        age[1][1]="NJ";
        age[1][2]="67,000";

        age[2][0]="Kajol";
        age[2][1]="MI";
        age[2][2]="89,345";


        System.out.println("The size of this 2D Array is: "+ age.length);
        System.out.println();
        System.out.println(age[2][2]);
        System.out.println();
        for(String ag[] : age){
            for(String agg : ag){
                System.out.print(agg+ "      ");
            }
            System.out.println();
        }


    }



















}
