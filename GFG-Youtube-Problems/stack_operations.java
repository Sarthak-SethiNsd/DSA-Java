import java.util.*;
public class stack_operations {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(50); // add 50 at the top
        st.push(10); // add 10 at the top
        st.push(20); // add 20 at the top
        st.push(30); // add 30 at the top
        System.out.println(st.peek()); //only see the top element without removing it
        st.pop(); //remove the top element
        System.out.println(st.size()); //print the number of elements of stack
        System.out.println(st.isEmpty()); // return true if stack is empty otherwise false
    }
}
