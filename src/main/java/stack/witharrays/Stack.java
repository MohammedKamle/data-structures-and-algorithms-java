package stack.witharrays;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is creted with the size of "+size);
    }

    public  boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull(){
        if (topOfStack == arr.length-1){
          //  System.out.println("The Stack is full!");
            return true;
        }else {
            return false;
        }
    }

    public void push(int value){
        if (isFull()){
            System.out.println("The Stack is full!");
        }else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println(value+" is successfully inserted in the stack!");
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("The Stack is empty!");
            return -1;
        }else {
            int topElement = arr[topOfStack];
            topOfStack--;
            return topElement;
        }
    }

    public  int peek(){
        if (isEmpty()){
            System.out.println("The Stack is empty!");
            return -1;
        }else {
            int topElement = arr[topOfStack];
            return topElement;
        }
    }

    public void deleteStack(){
        arr = null;
        System.out.println("The Stack is successfully deleted!");
    }
}
