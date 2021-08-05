package com.company;

public class LinkedList {

    private Node head;

    public void add(Node node){

        if (head == null){
            head = node;
        }

        else{
            Node curr = head;

            while (curr.next != null){
                curr = curr.next;
            }

            curr.next = node;
        }
    }


    public void delete(String string){
        if (head == null){
            System.out.println("Linked List is empty");
        }

        else if (head.val == string){

            if (head.next != null) {
                Node temp = head;
                head = head.next;
                temp = null;
            }

            else {
                head = null;
            }
        }

        else{
            Node curr = head;

            while (curr.next != null){
                if (curr.next.val == string){
                    Node temp = curr.next;
                    curr.next = curr.next.next;
                    temp = null;
                    return;
                }
            }

            System.out.println("Value does not exist.");
        }
    }

    public String getString(){
        String data = "";

        Node curr = head;

        while (curr != null){
            data += curr.val + ", ";
            curr = curr.next;
        }

        return data;
    }
}
