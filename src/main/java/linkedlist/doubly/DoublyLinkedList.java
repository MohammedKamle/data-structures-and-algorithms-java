package linkedlist.doubly;

import java.security.PublicKey;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.previous = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    public void insertDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.previous = null;
            head.previous = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.previous = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.previous = newNode;
        }
        size++;
    }

    public void traverseDLL() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The DLL does not exist!");
        }
        System.out.println();
    }

    public void reverseTraversalOfDLL() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("<-");
                }
                tempNode = tempNode.previous;
            }
        } else {
            System.out.println("The DLL does not exist!");
        }
        System.out.println();
    }

    public boolean searchNodeInDLL(int nodeValue) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node found at index : " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    public void deleteNodeDLL(int location) {
        if (head == null) {
            System.out.println("The DLL does not exist");
            return;
        } else if (location == 0) { // deleting first node
            // if these is only one node in DLL then size =1
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.previous = null;
                size--;
            }
        } else if (location >= size) { // deleting last node
            DoublyNode secondLastNode = tail.previous;
            // if these is only one node in DLL then size =1
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            }else {
                secondLastNode.next = null;
                tail = secondLastNode;
                size--;
            }
        }else { // deleting a node in the middle
            DoublyNode tempNode = head;
            for (int i=0; i<location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.previous = tempNode;
            size--;
        }
    }

    public void deleteEntireDLL(){
        DoublyNode tempNode = head;
        for (int i=0; i<size; i++){
            tempNode.previous = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        size =0;
        System.out.println("The DLL has been successfully deleted!");
    }

}