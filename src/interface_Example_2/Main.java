package interface_Example_2;
// interface tells what needs to be implemented
// but the class can decide how it gets implemented

public class Main {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();

      //  for(int i = 0; i < 5; i++){
       //     System.out.println(byTwos.getNext());



        ByThrees byThrees = new ByThrees();
            for(int i = 0; i < 5; i++){
                System.out.println(byThrees.getNext());
    }
}
}