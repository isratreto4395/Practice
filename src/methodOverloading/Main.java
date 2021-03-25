package methodOverloading;

public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 10, 30, 40};
        int ele = 30;

        SearchUtil obj = new SearchUtil();

        int x = obj.search(arr,ele); //2
        int y = obj.search(arr,ele,3); // search from pos 3

        System.out.println(" x is " + x);
        System.out.println(" y is " + y);
    }
}
