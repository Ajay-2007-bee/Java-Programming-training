package collection_framework;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(1004);
        myStack.push(1002);
        myStack.push(1009);

        System.out.println(myStack);
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack);
    }
}

