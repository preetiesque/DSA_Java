package com.company;


public class Linked_List {
    Node head;
    private int size;

    Linked_List(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add first , last
    public void addFirst(String data){
        Node newNode = new Node(data);

        if (head == null){
           head = newNode;
           return;
        }
        size++;
        newNode.next = head;
        head = newNode;
    }

    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        //traverse the linked list
        Node curr_node = head;
        while(curr_node.next != null){
            curr_node = curr_node.next;
        }
        curr_node.next = newNode;
    }

    //print the linked_list
    public void print_list(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node curr_Node = head;
        while(curr_Node != null){
            System.out.print(curr_Node.data + " -> ");
            curr_Node = curr_Node.next;
        }
        System.out.println("NULL");

    }

    //delete first
    public void deleteFirst(){
        if (head == null){
            System.out.println("The list is empty");
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if (head == null){
            System.out.println("The list is empty");
        }
        size--;

        if (head.next == null){
            head = null;
            return;
        }
        Node second_Last = head;
        Node last_Node = head.next;
        while (last_Node.next != null){ //null.next gives error hence one more corner case
            last_Node = last_Node.next;
            second_Last = second_Last.next;
        }

        second_Last.next = null;
    }

    public int getSize(){
        return size;
    }


    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.addFirst("a");
        list.addFirst("is");
        list.print_list();

        list.addLast("List");
        list.print_list();
        list.addFirst("This");
        list.print_list();

        list.deleteFirst();
        list.print_list();

        list.deleteLast();
        list.print_list();

        System.out.println(list.getSize());

    }
}
