package stack.withlinkedlist;

public class Stack {
    LinkedList linkedList;

    public Stack(){
        linkedList = new LinkedList();
    }

    public void push(int value){
        linkedList.insertInLinkedList(value, 0);
        System.out.println(value+" is successfully inserted in the stack!");
    }

    public boolean isEmpty(){
        if (linkedList.head == null){
            return true;
        }else {
            return false;
        }
    }

    public int pop(){
        int result =-1;
        if (isEmpty()){
            System.out.println("The Stack is empty!");
        }else {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }

    public int peek(){
        int result = -1;
        if (isEmpty()) {
            System.out.println("The Stack is empty!");
        }else {
            result = linkedList.head.value;
        }
        return result;
    }

    public void deleteStack(){
        linkedList.head = null;
        System.out.println("Stack is successfully deleted!");
    }
}
