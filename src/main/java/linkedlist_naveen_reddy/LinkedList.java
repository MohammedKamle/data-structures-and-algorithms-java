package linkedlist_naveen_reddy;

public class LinkedList {
    Node head;

    // insertion at the end
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        // if its a first node
        if (head == null){
            head = node;
        }// insertion at the end
        else {
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        if (index == 0){
            insertAtStart(data);
        }else {
            Node n = head;
            for (int i=0; i<index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }

    }

    public void deleteAt(int index){
        if (index == 0){
            System.out.println(head.data+" is deleted");
            // actual deletion happens below
            head = head.next;
        }else {
            Node n = head;
            for (int i=0; i<index-1; i++){
                n = n.next;
            }
            Node nodeToBeDeleted = n.next;
            n.next = nodeToBeDeleted.next;
            // to make deleted node eligible for garbage collection
            System.out.println(nodeToBeDeleted.data+" is deleted");
            nodeToBeDeleted =null;

        }
    }



    // traverse SinglyLinkedList
    public void show(){
        Node n = head;
        while (n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
