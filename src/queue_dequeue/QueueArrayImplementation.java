package queue_dequeue;

public class QueueArrayImplementation {
    int capacity; //the capactiy of the array
    int queueArr[]; //its going to be a integer array
    int front; //front value
    int rear;//end values
    int currentSize;//the current size of the array

    public QueueArrayImplementation(int sizeOfQueue){
        this.capacity = sizeOfQueue;
        //whatever the size i am giving to the array
        //example- int sizeOfQueue is 10 so i am assigning that size to the capacity of the array
        front = 0;//our array is initially empty so thats we have it equal to 0
        rear = -1;
        queueArr = new int[capacity]; // so the size of the array is the capacity or how much elements can be held in the array that we defined above
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("hey, queue is full, cannot insert the data");
        }else{
            rear++;
            if(rear == capacity-1){
                rear = 0;
            }
            queueArr[rear]=data;
        }

    }

    public boolean isFull(){
        if(currentSize == capacity){
            return true;//so i am saying its full...example- 10 ==10
        }
        return false;
    }

    public boolean isEmpty(){
        if(currentSize == 0){//if it equals 0 then thats means the array is empty
            return true;
        }
        return false;
    }

}
