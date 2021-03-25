package array.array1D;

public class ClassExampleLearnArrayWithMethod {


    public static void main(String[] args) {

        int[] numbers = {23, 34, 65, 12, 3, 102, 87, 46, 304};

        ClassExampleLearnArrayWithMethod.checkMinimum(numbers);
        ClassExampleLearnArrayWithMethod.checkMaximum(numbers);
        ClassExampleLearnArrayWithMethod.getArray();
    }

    /**
     * this method will check Minimum value from an Array
     * @param num
     * Author: Mahmud
     */
    static void checkMinimum(int num[]) {
        int min = num[0];//taking the first index as the minimum
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {//ex: min=23 > num[i=first value of the array] = 23
                min = num[i];//ex: if 23 greater than 23 then it is the minium.. but if 23 is not greater than 23 then it will go to the next number
                //in this case since 23 is not greater than 23. it will move on to the next index, so num[1].. and 23 will continue to compare with all the array values
                //until the statement is true
            }
        }
        System.out.println("Minimum value : "+min);
    }
    static void checkMaximum(int num[]) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("Maximum value : "+max);

    }
    static int[] getArray(){
        return new int[]{88,66,70,90,23,12,405};
    }


}
