package interface_Example_2;


    public class ByThrees implements Series {
        int value;

        ByThrees() {
            value = 0;
        }

        @Override
        public int getNext() {
            value += 3;
            return value;
        }
    }
