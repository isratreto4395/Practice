package stack;


//how to implement stack using array
//interview Question--> how will you implement your own stack

//push()--> is to enter the data in your stack--> push happens from bottom to top
//the moment I push the data, the size will be increased by 0ne each time

//pop()--> is to fetch the data from your stack based on LIFO(last in first out)--> what is the last element entered will be the first to be fetched when you print
//ex. if 6 is the last element to be entered into stack then when using the pop() 6 will be the first number displayed
//pop() remove the element from the top of the stack. so 6 is displayed and removed
//pop() decreases the size of the stack by 0ne

//isEmpty()--> is stack empty or not

//isFull()--> is stack full or not. if it not full then you can continue to add more data

//peek()--> fetch the first element without removing from the stack



public class LearnStackImplementationUsingArray {
    public static void main(String[] args) {
        StackImplementationClass stack = new StackImplementationClass(10);
        StackImplementationClass.pop();

        System.out.println("**********************************************************");

        StackImplementationClass.push(78);
        StackImplementationClass.push(101);
        StackImplementationClass.push(67);
        StackImplementationClass.push(677);

        System.out.println("**********************************************************");

        StackImplementationClass.peek();

        System.out.println("**********************************************************");

        StackImplementationClass.pop();
        StackImplementationClass.pop();

        System.out.println("**********************************************************");
        //System.out.println(StackImplementationClass.peek());
        StackImplementationClass.peek();

        System.out.println("**********************************************************");

        System.out.println(StackImplementationClass.isEmpty());

        System.out.println("**********************************************************");

        System.out.println(StackImplementationClass.isFull());

        System.out.println("**********************************************************");


        }




    }







