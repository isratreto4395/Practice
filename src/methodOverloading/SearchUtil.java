package methodOverloading;

public class SearchUtil {
     public int search (int a[], int ele) {
         for(int i = 0; i<a.length; i++){
             if (a[i] == ele){
                 return i;
             }
         }
            return -1;

     }

    public int search (int a[], int ele, int pos) {
        for(int i = pos; i<a.length; i++){
            if (a[i] == ele){
                return i;
            }
        }
        return -1;

    }

}
