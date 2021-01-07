package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.println(list.size);
        list.print();
        list.insertAt(2,6);
        System.out.println();
        System.out.println(list.size);
        list.print();
        list.remove(5);
        System.out.println();
        System.out.println(list.size);
        list.print();
        list.removeAt(0);
        System.out.println();
        System.out.println(list.size);
        list.print();

    }
}
