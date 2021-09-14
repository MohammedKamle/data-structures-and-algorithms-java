package linkedlist_naveen_reddy;

public class Runner {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(3);

        list.insertAtStart(45);

        list.insertAt(0, 666);

        list.show();

        list.deleteAt(3);
        list.deleteAt(0);

        System.out.println("**********");

        list.show();
    }
}
