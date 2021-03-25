package interface_Example_2;

public class ByTwos implements Series {
    int value;
    ByTwos(){
        value = 0;
    }

    @Override
    public int getNext() {
        value +=2;
        return value;
    }
}
