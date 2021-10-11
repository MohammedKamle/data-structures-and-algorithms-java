package queue.usinglinkedlist;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public  Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Inserting in a singly linked list
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        // if the list is empty
        if (head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }
        // to insert at the start of the list
        else if (location == 0){
            node.next = head;
            head = node;
        }
        // to insert at the end of the list
        else if (location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }
        // to insert somewhere middle
        else {
            Node tempNode = head;
            int index =0;
            while (index < location -1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;

        }
        size++;
    }

    // linked list traversal
    public void traverseSinglyLinkedList(){
        if (head ==null){
            System.out.println("No elements to display");
        }else {
            Node tempNode = head;
            for (int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if (i < (size-1)){
                    System.out.print("->");
                }
                tempNode= tempNode.next;
            }
        }
        System.out.println();
    }

    public boolean searchNode(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i=0; i<size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("Node found at location :"+i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    // deleting a node from singly linked list
    public void deletionOfNode(int location){
        if (head==null){
            System.out.println("Linked list doesn't exist");
            return;
        } // to delete the node at the start
        else if (location == 0){
            head = head.next;
            size--;
            // if there was only one node in the list and that itself is deleted  then size becomes 0
            if (size ==0){
                tail =null;
            }
        } // to delete the last node
        else if (location >= size){
            Node tempNode = head;
            // iterating until we reach the node previous to last node
            for (int i=0; i<(size-1); i++){
                tempNode = tempNode.next;
            }
            // if there was only one node in the list then tempNode will be equal to head with size 1
            if (tempNode == head){
                head = tail = null;
                size--; // size will become 0 as empty list
                return;
            }
            // if there was more than one node
            tempNode.next = null;
            tail = tempNode;
            size--;
        } // to delete a node at a specific location
        else {
            Node tempNode = head;
            for (int i=0; i<(location-1); i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // deletion of entire SLL
    public void deleteEntireSLL(){
        head = null;
        tail =null;
        size =0; // i have added this
        System.out.println("The SLL is deleted successfully");
    }



}
