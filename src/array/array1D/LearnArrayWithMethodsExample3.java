package array.array1D;

public class LearnArrayWithMethodsExample3 {
    public static void main(String[] args) {
      int size[] = {32,34,36,38,40,42,44,46,48,50};
      maxVal(size);
      minVal(size);

    }
    public static void maxVal(int num[]){
        int max = num[0];
        for(int i = 0; i< num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("The max value is: "+ max);
    }

    public static void minVal(int num[]){
        int min = num[0];
        for(int i = 0; i< num.length;i++){
            if(num[i]<min){
                min=num[i];

            }
        }
        System.out.println("The min value is: "+min);
    }
























}
