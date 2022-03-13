package com.company;

import com.company.Node;

public class MyStack_LinkedList {
    private Node head;
    private int size;

    public MyStack_LinkedList() {
        this.size = 0;
        this.head = null;
    }

    public void push(Node node) {
        node.next = this.head;
        this.head = node;
        this.size++;
    }

    public Node pop() {
        if (this.isEmpty()) {
            System.out.print("Stack is empty \n");
            return null;
        }
        Node node = this.head;
        this.head = this.head.next;
        this.size--;
        return node;
    }

    public Node peek() {
        if (this.isEmpty()) {
            System.out.print("Stack is empty \n");
            return null;
        }
        return this.head;
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }

    public void print() {
        System.out.print("Stack: \n");
        Node node = this.head;
        while (node != null) {
            node.printData();
            node = node.next;
        }
    }
}
