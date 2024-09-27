package dataStructures.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        head = null;
    }

    public void add(int element) {
        Node newNode = new Node(element);
        Node current = head;

        if (head == null) {
            head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current = newNode;
        }
        ++size;
    }

    public void remove(int element) {
        Node current = head;
        Node previous = null;

        while (current.next != null) {

            if(current.data == element) {
                if(current == head) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
            }

            previous = current;
            current = current.next;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void printAllElements() {
        Node current = head;

        if(head != null) {
            System.out.println(head.data);
        }

        while(current.next != null) {
            current = current.next;
            System.out.println(current.data);
        }
    }
}

