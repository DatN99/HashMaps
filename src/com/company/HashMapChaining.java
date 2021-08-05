package com.company;

/**
 * This class contains my hashmap that uses chaining to resolve collisions
 *
 * On average, it takes O(1) time to find the LinkedList to insert and remove a string since it can be found by accessing
 * the index using the hash key
 *
 * However, on average it takes O(n) time to traverse through the linked list to find the tail node to insert or the right node
 * to delete
 */
public class HashMapChaining {

    LinkedList[] array = new LinkedList[100];

    HashMapChaining(){

        for (int i = 0; i < 100; i++){
            array[i] = new LinkedList();
        }
    }


    private int hash(String string){
        int hash = array.length;

        for (int i = 0; i < string.length(); i++){
            hash = (hash *31) + string.charAt(i);
        }

        hash = hash % array.length;

        return Math.abs(hash);
    }

    public void insert(String string){
        int key = hash(string);

        Node node = new Node(string);

        array[key].add(node);
    }

    public void remove(String string){
        int key = hash(string);

        array[key].delete(string);
    }

    public void print(){

        int i = 0;

        for (LinkedList LL : array){
            System.out.println(i + ": " + LL.getString());
            i++;
        }
    }
}
