package stack.withlinkedlist;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.isEmpty());
        //pop
        System.out.println(stack.pop());
        //peek
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        // delete stack
        stack.deleteStack();


    }
}
