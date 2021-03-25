package sort;

public class Sort {
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        selectionSort(unSortedArray);

    }

    public static int[] selectionSort(int[] array) {

        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[i] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        System.out.println(array);
        return array;
    }
}
