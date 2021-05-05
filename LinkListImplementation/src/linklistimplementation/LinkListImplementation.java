/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistimplementation;

import java.util.Stack;

/**
 *
 * @author HP
 */
public class LinkListImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // performOperationsONLinkedList();
        LinkedList linkList = new LinkedList();
        linkList.insert(1);
        linkList.insert(2);
        linkList.insert(3);
        linkList.insert(4);
        linkList.insert(5);
        Node reversedLinkList = linkList.reverseLinkedListOnIndex(linkList.head, 2, 5);
//        Node reversedLinkList = linkList.reverseLinkList();
        while (reversedLinkList.next != null) {
            System.out.println(reversedLinkList.data);
            reversedLinkList = reversedLinkList.next;
        }
         System.out.println(reversedLinkList.data);
        //linkList.print();
    }

    private static void performOperationsONLinkedList() {
        LinkedList linkList = new LinkedList();
        linkList.insert(15);
        linkList.insert(18);
        linkList.insert(100);
        linkList.insert(20);
        //For insert the list at start so it becomes head;
        //  linkList.insertDataAt(0, 150);
        // linkList.deleteDataAt(2);
        //  linkList.deleteDataAt(2);
        //For print all the link List;
        linkList.print();
        int value = linkList.getDataAt(7);

        linkList.clear();
        //System.out.println(value);
        // System.out.println(linkList.size());
    }

    private static void reverseLinkList(LinkedList linkList) {
        LinkedList linkListReplica = new LinkedList();
        Stack<Integer> listStack = new Stack();
        for (int i = 0; i < linkList.size(); i++) {
            listStack.push(linkList.getDataAt(i));
        }
        for (int i = 0; i < linkList.size(); i++) {
            linkListReplica.insert(listStack.pop());
        }
        System.out.println("Reversed Linked List");
        linkListReplica.print();
    }

}
