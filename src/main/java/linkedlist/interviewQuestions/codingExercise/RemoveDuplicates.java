package linkedlist.interviewQuestions.codingExercise;

import linkedlist.interviewQuestions.LinkedList;
import linkedlist.interviewQuestions.Node;

import java.util.HashSet;
import java.util.Set;

/*
* Coding excercise - 24
* */
public class RemoveDuplicates {

    // My Approach - using loops
    public  static  LinkedList removeDuplicates(LinkedList list){
        boolean flag = false;
        Node tempNodeForOriginalList = list.head;
        LinkedList newList = new LinkedList();
        for (int i=0; i<list.size; i++){
            if (newList.head == null){
                newList.createLinkedList(tempNodeForOriginalList.value);
                tempNodeForOriginalList = tempNodeForOriginalList.next;
                continue;
            }
            Node tempNodeForNewList = newList.head;
            for (int j=0 ; j<newList.size; j++){
                if (tempNodeForNewList.value== tempNodeForOriginalList.value){
                    flag = true;
                    break;
                }
                tempNodeForNewList = tempNodeForNewList.next;
            }
            if (!flag){
                newList.insert(tempNodeForOriginalList.value);
            }
            flag = false;
            tempNodeForOriginalList = tempNodeForOriginalList.next;
        }
        return newList;
    }

    // My approach - using hashset
    public static LinkedList removeDuplicates_(LinkedList list){
        Set<Integer> set = new HashSet();
        LinkedList newList = new LinkedList();
        Node tempNode = list.head;
        int index =0;
        while (index < list.size){
            System.out.println(tempNode.value);
            if ((set.add(tempNode.value))){
                if (newList.head == null){
                    newList.createLinkedList(tempNode.value);
                }else {
                    newList.insert(tempNode.value);
                }

            }
            tempNode = tempNode.next;
            index++;
        }
        return newList;
    }

    // Instructor's approach -- most optimize, here we didn't used another list to avoid extra space complexity
    public static void removeDuplicates__(LinkedList ll){
        HashSet<Integer> hs = new HashSet<>();
        Node currentNode = ll.head;
        Node prevNode = null;
        while (currentNode.next != null){
            int currentValue = currentNode.value;
            if (hs.contains(currentValue)){
                prevNode.next = currentNode.next;
                ll.size--;
            }else {
                hs.add(currentValue);
                prevNode = currentNode;

            }
            currentNode = currentNode.next;

        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.createLinkedList(1);
        list.insert(2);
        list.insert(1);
        list.insert(1);
        list.insert(3);
        list.traverse();

       // LinkedList list2 = removeDuplicates_(list);
        //list2.traverse();
        removeDuplicates__(list);
        list.traverse();
    }
}
