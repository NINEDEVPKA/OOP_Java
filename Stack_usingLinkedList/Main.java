package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print("Stack - Java \n");

        MyStack_LinkedList stack = new MyStack_LinkedList();

        stack.push(new Node(101));
        stack.push(new Node(202));
        stack.push(new Node(303));
        System.out.print("\n");
        stack.print();
        System.out.print("\n");
        System.out.print("\n");

        Node node = stack.peek();
        if (node != null) {
            System.out.print("Peek\n");
            node.printData();
        }

        Node node2 = stack.pop();
        if (node != null) {
            System.out.print("Pop\n");
            node.printData();
        }

        System.out.print("\n");
        stack.print();
    }
}
