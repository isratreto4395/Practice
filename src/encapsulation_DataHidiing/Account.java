package encapsulation_DataHidiing;

public class Account {

    private double balance = 0; //default is zero hence initialization not required

    public void debit(double amount) {
        if (amount > 0 && amount <= balance)//deduct the amount if its valid and sufficient balance
        {
            balance -= amount; // balance = balance minus amount
        }
    }
    public void credit(double amount){
            if (amount > 0){
              balance += amount;
            }
        }

    public void showBalance(){
        System.out.println("Current balance - " + balance);
    }

    }



