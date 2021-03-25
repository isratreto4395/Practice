package array.array1D;

public class ArrayMethodMaxMin {
    public static void main(String[] args) {
        double grade[] = {99.8,67.5,55.8,89.9,90.1,99.6,100.1,78.4};

        max(grade);
        min(grade);


    }

    public static void max(double grades[]) {//we are passing an array as a parameter so that we can connect to the array in the main method
        //we want to find the max and min value in our array
//we want a variable "max" to hold the largest value in our array
// and initialize it to a starting value. in this case we will make it the first index.. araay[0]
        double max = grades[0];// so we r setting the largest value to 99.8 for now.
        //using for loop- i am calling the index so the "i(index)" always has to be int
        for (int i = 0; i < grades.length; i++) {
            if (grades[i]>max) {
                max = grades[i];

                //int i = 0 means we r starting at index 0 of the array
                //i<grades.length means we r comparing the initial index (0) to length of the array.
                //if "i" is less than grades.length then increment the "i" by 1 in the future-so next turn
                //then we have a if condition to check for max
                //if(max<grades[i]) means we initialized max to index 0 of the array
                //so if the element at index 0 is less than whatever the value for grades[i] is
                //then we reassign the max value to that value we got from the array


            }
        }
        System.out.println("The maximum value is: "+max);

    }
        public static void min(double gradez[]){
            double min = gradez[0];//setting the min to a value.. in this case we are setting it index[0]=99.8
            for(int i = 0; i< gradez.length;i++ ){
                if(gradez[i]<min){
                    min=gradez[i];
                }
    }
            System.out.println("The minimum value is: "+min);
    }
}
