package array.array1D;



public class ArrayWIthMethods {
    public static void main(String[] args) {
        System.out.println("The average age is: " + averageAge());
        System.out.println();
        maxValue(averageAg());// we are able to use method inside a method because i made the "averageAg" an array
        //so since i passed an array as a parameter inside the max and min method, i am able to use "averageAg" as an argument inside the max min method
        minValue(averageAg());

        System.out.println();
        //System.out.println(Arrays.toString(averageAg()));
        averageAg();


    }

    public static double averageAge() {
        double age[] = new double[6];
        age[0] = 13;
        age[1] = 23;
        age[2] = 8;
        age[3] = 67;
        age[4] = 87;
        age[5] = 99;
        double total = (age[0] + age[1] + age[2] + age[3] + age[4] + age[5]) / age.length;

        return total;
    }

    public static int [] averageAg() {// I made the averageAg an array so that I can use this mehtod as a argument with another method.. so another method that is an array
        //can use this method as a argument.

        int ag[] = new int[6];
        ag[0] = 134;
        ag[1] = 236;
        ag[2] = 88;
        ag[3] = 679;
        ag[4] = 870;
        ag[5] = 995;

        for(int i = 0; i<ag.length; i++){
            System.out.println(ag[i]);
        }
        return ag;

    }

    public static void maxValue(int nums[]){
        int max = nums[0];
        for(int i = 0; i< nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println("The max value is: "+max);
    }

   public static void minValue(int numz[]){
        int min = numz[0];
        for(int i = 0; i< numz.length;i++){
            if(numz[i]<min){
                min = numz[i];
            }
        }
       System.out.println("The min value is: "+min);

   }

}

