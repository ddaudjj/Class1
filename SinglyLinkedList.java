package com.mycompany.singlylinkedlist;

class Node {
    int data;
    Node address;

    Node(int data) {
        this.data = data;
        this.address = null;
    }
}

class SLL {
    Node head;
    Node tail; // Added to manage tail in the add method.

    // Find length
    public int getLength() {
        Node current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.address;
        }
        return length;
    }

    // Find middle node
    public void Middle() {
        Node slow = head;
        Node fast = head;

        if (head != null) {
            while (fast != null && fast.address != null) {
                slow = slow.address;
                fast = fast.address.address;
            }
            System.out.println("Middle Node: " + slow.data);
        }
    }

    // Reverse list
    public void Reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.address;
            current.address = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    // Remove duplicates
    public void Duplicates() {
        Node current = head;

        while (current != null && current.address != null) {
            if (current.data == current.address.data) {
                current.address = current.address.address;
            } else {
                current = current.address;
            }
        }
    }

    // Merge two sorted lists
    public static SLL merge(SLL list1, SLL list2) {
        SLL mergedList = new SLL(); // New merged list
        Node current1 = list1.head;
        Node current2 = list2.head;
        while (current1 != null && current2 != null) {
            if (current1.data <= current2.data) {
                mergedList.add(current1.data);
                current1 = current1.address;
            } else {
                mergedList.add(current2.data);
                current2 = current2.address;
            }
        }
        // If there are remaining nodes in list1
        while (current1 != null) {
            mergedList.add(current1.data);
            current1 = current1.address;
        }
        // If there are remaining nodes in list2
        while (current2 != null) {
            mergedList.add(current2.data);
            current2 = current2.address;
        }
        return mergedList;
    }

    // Add node to list
    public void add(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = tail = n;
        } else {
            tail.address = n;
            tail = n;
        }
    }

    // Delete entire list
    public void delete() {
        head = null;
        System.out.println("List is deleted.");
    }

    // Print list
    public void PrintList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.address;
        }
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Original List: ");
        list.PrintList();

        System.out.println("Length of the list: " + list.getLength());

        list.Middle();

        list.Reverse();
        System.out.println("Reversed List: ");
        list.PrintList();

        list.Duplicates();
        System.out.println("List after removing duplicates: ");
        list.PrintList();

        SLL list2 = new SLL();
        list2.add(8);
        list2.add(9);
        list2.add(0);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        
        SLL mergedList = SLL.merge(list, list2);
        System.out.println("Merged List:");
        mergedList.PrintList();

        list.delete();
    }
}

    