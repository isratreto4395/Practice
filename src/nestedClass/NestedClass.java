package nestedClass;

class Outside {
    int a = 0;

    static class Inside{
        int b = 5;
        //if it was private class Inside{
        // it would give us an error when we try to create an object of
        //the inside class because the otuside class cant see it
    }
}


public class NestedClass {

    public static void main(String[] args) {


        Outside o = new Outside();
        Outside.Inside i = new Outside.Inside();// you can do this if the class is static
        //Outside.Inside i = o.new Inside();// do this if its non-static
        System.out.println(o.a + " "+ i.b);

    }
}
