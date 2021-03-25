package encapsulation_DataHidiing;

public class Main {
    public static void main(String[] args) {


        Account a1;
        a1 = new Account();

        a1.credit(2000);
        a1.debit(1000);
        a1.showBalance();


        a1. showBalance();
    }
}


// restricting direct access to data is called data hiding
//it is not hidden- it is only hidden for direct access