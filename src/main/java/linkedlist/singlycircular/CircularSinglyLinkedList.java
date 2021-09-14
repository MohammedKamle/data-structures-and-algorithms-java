package linkedlist.singlycircular;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size =1;
        return head;
    }

    public void insertCSLL(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createCSLL(nodeValue);
            return;
        }else if (location == 0){ // inserting at start
            node.next = head; // pointing new node's next reference to current first
            head = node;// assigning head to new first node
            tail.next = head;// changing last node's next reference(through tail, as tail itself represents last node) to the new first node
        }else if (location >= size){ // inserting at the end
            tail.next = node; // pointing last node's next reference to new node
            tail = node;// making tail as new node, as new node is the last node now
            tail.next = head; // making last node (ie , new node) pointing to first node
        }else { // inserting in the middle
            Node tempNode = head;
            int index =0;
            while (index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    public void traverseCSLL(){
        if (head != null){
            Node tempNode = head;
            for (int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if (i != size-1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        }else {
            System.out.println("\nCSLL does not exist");
        }
    }

    public boolean searchNode(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i=0; i<size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("Node found at index: "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    public void deleteNode(int location){
        if (head == null){
            System.out.println("The CSLL does not exist");
            return;
        }else if (location == 0){ // deleting first node
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0){ // if there is only one node in the list
                tail = null;
                head.next =null;
                head = null;
            }
        }else if (location >= size){
            Node tempNode = head;
            for (int i=0; i<size-1; i++){
                tempNode = tempNode.next;
            }
            if (tempNode == head){ // if there is only one node in the list
                head.next =null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        }else {
            Node tempNode = head;
            for (int i=0; i<location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteEntireCSLL(){
        if (head == null){
            System.out.println("The CSLL does not exist");
        }else {
            head =null;
            tail.next = null;
            tail =null;
            size = 0; // i have added this
            System.out.println("The CSLL has been deleted successfully!");
        }
    }
}
