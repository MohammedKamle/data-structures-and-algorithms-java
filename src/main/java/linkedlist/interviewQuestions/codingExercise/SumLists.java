package linkedlist.interviewQuestions.codingExercise;

import linkedlist.interviewQuestions.LinkedList;
import linkedlist.interviewQuestions.Node;

/*
* Coding Exercise - 27
* */
public class SumLists {

    // My approach
    public static  LinkedList sumLists(LinkedList list1, LinkedList list2){
       list1 = reverseList(list1);
       list2 = reverseList(list2);
       Node t1 = list1.head;
       Node t2 = list2.head;

        int sum1 = 0;
        int sum2 =0;
       while ((t1 != null) && (t2 != null)){
           sum1 = (sum1*10) + t1.value;
           sum2 = (sum2*10) + t2.value;
           t1 = t1.next;
           t2 = t2.next;
       }
       int res = sum1 + sum2;
       Node t3 = list1.head;
      while ((res != 0) && (t3 != null)){
          int temp = res % 10;
          t3.value = temp;
          t3 = t3.next;
          res = res / 10;
      }
      return  list1;
    }

    public static LinkedList reverseList(LinkedList list){
        Node prev =null;
        Node current = list.head;
        Node next = list.head;
        while (next != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;
        return  list;
    }

    // INSTRUCTOR'S APPROACH
    public static  LinkedList sumLists_(LinkedList list1, LinkedList list2){
        Node t1 = list1.head;
        Node t2 = list2.head;
        int carryOverNumberAfterAddition =0;
        LinkedList resultantList =new LinkedList();
        while (t1 != null || t2 != null){
            int result = carryOverNumberAfterAddition;
            if (t1 != null){
                result = result + t1.value;
                t1 = t1.next;
            }
            if (t2 != null){
                result = result + t2.value;
                t2 = t2.next;
            }
            resultantList.insert(result % 10);
            carryOverNumberAfterAddition = result /10;
        }
        return  resultantList;
    }


    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.createLinkedList(7);
        list1.insert(1);
        list1.insert(6);
        list1.traverse();

        list2.createLinkedList(5);
        list2.insert(9);
        list2.insert(2);
        list2.traverse();

        LinkedList list3= sumLists_(list1,list2);
        list3.traverse();
    }
}
