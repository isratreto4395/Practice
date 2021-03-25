package static_vs_nonstatic;

import constructor.Shirt_constructor;

public class Example_For_Mentoring {

    public static void main(String[] args) {
        Shirt_constructor.putOn();// i am able to access this in a different package inside the same project
    }
}
