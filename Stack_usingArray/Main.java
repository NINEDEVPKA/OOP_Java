package com.company;

class Stack
{
    private int Arr[];
    private int top;
    private int capacity;

    Stack(int size)
    {
        Arr = new int[size];
        capacity = size;
        top = -1;
    }


    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }

        System.out.println("Inserting " + x);
        Arr[++top] = x;
    }


    public int pop()
    {
        // kiem tra loi
        if (isEmpty())
        {
            System.out.println("Loi!!!");
            System.exit(-1);
        }
        System.out.println("Loai bo phan tu: " + peek());

        return Arr[top--];
    }

 
    public int peek()
    {
        if (!isEmpty()) {
            return Arr[top];
        }
        else {
            System.exit(-1);
        }

        return -1;
    }


    public int size() {
        return top + 1;
    }
    
    public boolean isEmpty() {
        return top == -1;               // or return size() == 0;
    }

    public boolean isFull() {
        return top == capacity - 1;     // or return size() == capacity;
    }
}



public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(1);
        stack.push(2);

        stack.pop();
        stack.pop();

        stack.push(3);

        System.out.println("phan tu dau tien la: " + stack.peek());
        System.out.println("kich thuoc ngan xep la: " + stack.size());

        stack.pop();        // removing (3)

        // kiem tra ngan xep trong
        if (stack.isEmpty()) {
            System.out.println("ngan xep trong!");
        }
        else {
            System.out.println("ngan xep day!");
        }
    }
}
