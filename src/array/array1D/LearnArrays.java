package array.array1D;




public class LearnArrays {
    public static void main(String[] args) {

        example1();
    }


    public static void example1(){
        int[] array = new int[5];
        array[0]=12;
        array[1]=34;
        array[2]=56;
        array[3]=5;
        array[4]=90;

        for(int i = 0; i<array.length;i++){
            System.out.println("Using For Loop: "+array[i]);
        }

        System.out.println();

        //another approach
        for(Integer inte : array){
            System.out.println("Using For Each Loop: "+inte);
        }

        System.out.println();
        System.out.println(array[0]);

        System.out.println();




    }























}
