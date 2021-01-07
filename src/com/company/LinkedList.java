package com.company;

public class LinkedList {

    Node head;
    Node last;
    int size=0;

    public  void insert(int data){
        if (head == null) {
            head = new Node(data);
            last = head;
            size++;
        }
        else insert(last,data);
    }

    private void insert(Node head , int data){
        last.next = new Node(data);
        last = last.next;
        size++;
    }

    public void insertAt(int index,int data){

        if (index<0 || index>size) throw new IndexOutOfBoundsException("INDEX OVERFLOW!");

        if (index==0 && head!=null){
            Node tempNode = new Node(data);
            tempNode.next=head;
            head=tempNode;
            size++;
        }else if (index == size){
                insert(head,data);
        }
        else{
            Node tempPtr = head;
            for (int i=0;i<index-1;i++) {
                tempPtr = tempPtr.next;
            }
            Node newNode = new Node(data);
            newNode.next = tempPtr.next;
            tempPtr.next=newNode;
            size++;
        }
    }



    public void remove(int data){
        if (head.data == data){
            head=head.next;
            size--;
        }else{
            remove(head,data);
        }
    }

    private void remove(Node head,int data){
        Node tempPtr =  head;
        while (tempPtr.next.data != data){
            tempPtr = tempPtr.next;
        }
        if (last == tempPtr.next){
            last = tempPtr;
            tempPtr.next=null;
        }else{
            tempPtr.next = tempPtr.next.next;
        }
        size--;
    }

    public void removeAt(int index){
        if (index<0 || index>size) throw new IndexOutOfBoundsException("INDEX OVERFLOW!");
        if (index == 0 ){
            head=head.next;
            size--;
        }else{
            removeAt(head,index);
        }
    }

    private void removeAt(Node head,int index){
        Node tempPtr = head;
        for (int i=0;i<index-1;i++) {
            tempPtr = tempPtr.next;
        }
        tempPtr.next=tempPtr.next.next;
        size--;
    }

    public void print(){
        print(head);
    }

    private void print(Node head){
        int i=0;
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

}
