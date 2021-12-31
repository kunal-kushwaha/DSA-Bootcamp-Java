package com.kunal;

public class DLL {

    private Node head;
    
    private int size ;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }
    
    
     public int deleteFirst(){
        if(head == null){
            System.out.println("Head is null");
            return -1 ;
        }
        Node node = head ;
        int val = head.value ;

        head= head.next ;
        node.next = null;

        head.prev = null ; //this is mandatory

        size-- ;

        return val ;
    }
    
    public Node get(int index){

        Node node = head;

        for (int i = 0 ; i < index ; i++){
            node = node.next ;
        }
        size -- ;
        return node ;
    }
    
    public int deleteLast(){
        if(size >= 1){
            deleteFirst() ;
        }

        Node node = get(size - 2);
       Node last = get(size - 1);

        int val = last.value ;

        if(last != null ){
            last.prev = null ;
        }
        node.next = null ;
        size-- ;
        return val ;
    }
    
    public int delete(int index) {
        if (index == 0){
            deleteFirst();
        }
        if (index == (size - 1)){
            deleteLast();
        }

        Node P = get(index - 1);
        Node Target = get(index);

        int val = Target.value;

        if (Target.next != null) {
            P.next = Target.next;
            Target.next.prev = Target.prev; // P
        }
        Target.next = null;
        Target.prev = null;

        size--;

        return value;
       
    }
    
    

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
