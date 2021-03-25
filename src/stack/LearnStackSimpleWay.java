package stack;

import java.util.Iterator;
import java.util.Stack;

public class LearnStackSimpleWay {
    public static void main(String[] args) {

        stack();



    }

    public static void stack(){
        Stack<Integer> st = new Stack<>();
        st.push(78);
        st.push(101);
        st.push(99);
        st.push(32);
        st.push(65);
        st.push(124);
        st.push(68);
        System.out.println("pushing element in stack : "+st);
        System.out.println("**********************************************************");
        System.out.println("Peek method : "+st.peek());
        System.out.println("**********************************************************");
        System.out.println("Pop method : "+st.pop());
        System.out.println("**********************************************************");
        System.out.println("Peek method : "+st.peek());
        System.out.println("**********************************************************");
        System.out.println("Is it empty? : "+st.empty());
        System.out.println("**********************************************************");
        //System.out.println("Is it full? : "+ st.);
        for(Integer in : st){
            System.out.println("Retrieving all the value : "+in);
        //System.out.println("**********************************************************");
//            Iterator ite = st.iterator();
//            while(ite.hasNext()){
//                System.out.println("Retrieving and popping the element : "+st.pop());
            //}


        }


    }

}
