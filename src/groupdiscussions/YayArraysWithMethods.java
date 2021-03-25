package groupdiscussions;

public class YayArraysWithMethods {
    public static void main(String[] args) {
     double grade[] ={99.8,67.5,55.8,88.9,99.6,100.1,78.4,102.3,100.2,104.5};
     int array1[] ={3,101,202,501,801,87,6};
     //max(grade);
//        System.out.println();
//        //min(array1);
//        System.out.println();
//        //array2();
//        System.out.println("***********************");
       min(array2());
//        System.out.println();
//        max(array2());

        //array2();
    }


    public static int[] array2(){
      int gra[]=new int[6];
      gra[0]=134;
      gra[1]=236;
      gra[2]=88;
      gra[3]=679;
      gra[4]=870;
      gra[5]=995;
//      for(int arr : gra){
//          System.out.println("Using for each loop: "+arr);
      //}
      for(int i=0;i<gra.length;i++){
          System.out.println(gra[i]);
      }

      return gra;
    }


    public static void max(double array[]){
        double max1 = array[0];//99.8
        for(int i = 0; i<array.length;i++){//i=0=99.8>99.8
            if (array[i]>max1){//grade[8]=102.3>99.8
                max1=array[i];//array[8]
            }
        }

        System.out.println("The max value is: "+max1);
    }
    public static void max(int array7[]){
        int max1 = array7[0];//99.8
        for(int i = 0; i<array7.length;i++){//i=0=99.8>99.8
            if (array7[i]>max1){//grade[8]=102.3>99.8
                max1=array7[i];//array[8]
            }
        }

        System.out.println("The max value is: "+max1);
    }

    public static void min(int arrayzzz[]){
        int min1 = arrayzzz[1];
        //int min1=;
        for(int i = 0; i<arrayzzz.length;i++){
            if(arrayzzz[i]<min1){//arrayzz[5]=6<10
                min1=arrayzzz[i];
            }
        }
        System.out.println("The min value is: "+min1);
    }

}
