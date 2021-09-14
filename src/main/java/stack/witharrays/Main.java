package stack.witharrays;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        // inserting element exceeding the size
        stack.push(5);
        //pop
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //peek
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        //delete stack
        stack.deleteStack();
    }
}
