package stack;

public class StackImplementationClass {
    static int size;//what will be the size of the array?
    static int arr[];//I will be using a integer type array
    static int top;//what are the values available on the top position

    StackImplementationClass(int size) {
        this.size = size;
        this.arr = new int[size];//we r assigning the size to the array
        this.top = -1;

    }

    public static void push(int element) {
        if (!isFull()) {//so if the stack is not full then we want to push(add)more elements
            top++;
            arr[top] = element;
            //array of top element will be equal to whatever the push element is
            System.out.println("Pushed element : " + element);
        } else {
            System.out.println("Stack is full");
        }
    }

    public static int pop() {
        if (!isEmpty()) {
            //if it is empty, no need to pop
            //if it is full, then pop
            //pop mean the stack will decrease by 1
            //so if it is not empty then it will remove the top positions

            int returnedTop = top;
            top--;
            System.out.println("pop element : " + arr[returnedTop]);
            return arr[returnedTop];
        } else {
            System.out.println("Stack is empty, no need to pop");
            return -1;
        }
    }

    public static boolean isEmpty(){
        return (top==-1);
        //if top is equal to -1, then my stack is going to be empty
        //no top is available so size is empty
    }

    public static boolean isFull(){
        return (size)-1 == top;
    //whatever size that u are getting its full or not if size minus 1 is equal to equal 1 is equal to top
    // ex. size(6) - 1 == (top) which means return the top element
    //full() will return boolean true or false
    }

    public static int peek(){
        if(!isEmpty()){
            System.out.println("Peek element : "+arr[top]);
            return arr[top];
    //if condition--> so I am using isEmpty method
    //I am saying if its not empty then return the top position
    //if there is a top position then it means thats a peek
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    }

