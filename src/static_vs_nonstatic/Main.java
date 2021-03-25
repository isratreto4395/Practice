package static_vs_nonstatic;


import java.util.Date;

public class Main {
    public static void main(String[] args) {


      MyDateUtil util = new MyDateUtil();

        Date now = new Date();
        System.out.println( now ); // using java date API- library

       String formattedDate = util.getFormattedDate(now);
        System.out.println(formattedDate);
    }
}