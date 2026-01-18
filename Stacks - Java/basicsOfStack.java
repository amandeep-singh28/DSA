import java.util.Stack;

public class basicsOfStack {
    public static void main(String[] args) {
        // Implementing Stack Using STL (Standard Template Library)
        //LIFO(Last In First Out) OR FILO(FIRST IN FIRST OUT)
        //Time Complexity -> O(n) -> For Getting an element, Space Complexity -> O(n)
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty()); // It checks whether a stack is empty or not
        System.out.println(st);
        st.push(3);
        st.push(23);
        st.push(42);
        st.push(17);
        System.out.println(st);
        // System.out.println(st.isEmpty());
        // System.out.println("Size is: " + st.size());

        // Peek Operation
        // System.out.println(st.peek()); // Returns the topmost element


        // Pop Operation
        // st.pop();
        // System.out.println(st);
        // st.pop();
        // System.out.println(st);

        // Suppose we want to access 23 element (But we have to firstly pop out the elements, if we want to access a particular element in the Stack)
        // That's why for getting an element in a Stack, Time Complexity and Space Complexity is O(n), becuase the elements which we have removed we have to put back those elements also and for retrieving we have to remove those above elements.
        // Advantage -> Iek type se Unlimited Size (Until the memory is full, But STACK UNDERFLOW will come if memory is fulled)
        while (st.size() > 2) {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);

    }
}