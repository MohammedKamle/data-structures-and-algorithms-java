package stack.interviewQuestions.geeksforgeeks;

/*
 * You can refer below yt video or geeksForGeeks
 * https://www.youtube.com/watch?v=TiYif1O1NTc
 * https://www.geeksforgeeks.org/implement-two-stacks-in-an-array/
 * */

public class ImplementTwoStacksInOneArray {
    private int[] arr;
    private int top1;
    private int top2;
    private int size;

    public ImplementTwoStacksInOneArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        this.size = sizeOfArray;
        top1 = -1;
        top2 = size;
    }

    public void push1(int value) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = value;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void push2(int value) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = value;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int res = arr[top1];
            top1--;
            return res;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public int pop2() {
        if (top2 < size) {
            int res = arr[top2];
            top2++;
            return res;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        ImplementTwoStacksInOneArray ts = new ImplementTwoStacksInOneArray(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from"
                + " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from"
                + " stack2 is " + ts.pop2());

    }
}
