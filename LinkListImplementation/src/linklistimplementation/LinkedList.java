/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistimplementation;

public class LinkedList {

    Node head;

    void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
    }

    void print() {
        Node tempNode = head;
        while (tempNode.next != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.data);
    }

    void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    void insertDataAt(int index, int data) {
        int linkIndex = 0;
        Node tempData = head;

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            tempData = tempData.next;
        }
        node.next = tempData.next;
        tempData.next = node;
    }

    void deleteDataAt(int index) {
        Node tempData = head;
        Node previousNode = null;
        if (index == 0) {
            head = tempData.next;
            return;
        }
        for (int i = 0; i <= index; i++) {
            if (i == index - 1) {
                previousNode = tempData;
            } else if (i == index) {
                previousNode.next = tempData.next;
            }
            tempData = tempData.next;
        }
    }

    int getDataAt(int index) {
        Node tempNode = head;
        if (index > size()) {
            return -1;
        }
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return tempNode.data;
            }
            tempNode = tempNode.next;
        }
        return 0;
    }

    int size() {
        if (head == null) {
            return 0;
        }
        Node tempNode = head;
        int index = 1;
        while (tempNode.next != null) {
            index++;
            tempNode = tempNode.next;
        }
        return index;
    }

    void clear() {
        head = null;
    }

    Node reverseLinkList() {
        Node previousNode = null;
        Node currentNode = head;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    Node reverseLinkedListOnIndex(Node head, int left, int right) {
        Node startNode = null;
        Node tailNode = null;
        Node previousNode = null;
        Node currentNode = head;
        int position = 1;
        while (position < left) {
            startNode = currentNode;
            currentNode = currentNode.next;
            position++;
        }
        tailNode = currentNode;//3
        while (position >= left && position <= right) {
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
            position++;
        }
        startNode.next = previousNode;
        tailNode.next = currentNode;
        if (left > 1) {
            return head;
        } else {
            return previousNode;
        }
    }
}
