package com.kunal;

public class DLL {
    
    private Node head;
    //INSERT AT FIRST POSTION IN DLL

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head!=null){
            head.prev = node;
        }

        head = node;
    }

    //INSERT AT LAST POSTION IN DLL

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head==null){
            node.prev= null;
            head = node;
            return;
        }

        while(last.next!=null){
            last=last.next;
        }
        last.next = node;
        node.prev= last;
    }

    //INSERT AT A GIVEN INDEX/POSTION IN DLL

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        Node temp = head;
        for(int i=1;i<index;i++){
            temp= temp.next;
        }
        node.next = temp.next;
        temp.next= node;
        node.prev = temp;
        temp.next.prev = node;
    }

    //INSERT A NODE AFTER A GIVEN VALUE

    public void insertAfter(int after,int val){
        Node p = find(after);
        Node node = new Node(val);
        if(p==null){
            System.out.println("Does Not Exist");
            return;
        }

        node.next= p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
            node.next.prev = node;
        }
    }


    //DELETE THE FIRST NODE

    public int deleteFirst(){
        int val = head.val;
        head.next.prev = null;
        head = head.next;
        return val;
    }

    //DELETE THE LAST NODE

    public int deleteLast(){
        Node last = head;
        while(last.next!=null){
            last=last.next;
        }
        int val = last.val;
        last.prev.next=null;
        return val;
    }

    //DELETE THE NODE AT A GIVEN INDEX

    public int delete(int index){
        Node last = head;
        int count = 0;
        while(count!=index){
            last= last.next;
            count++;
        }

        int count2=0;
        Node prev = head;
        while(count2<index-1){
            prev = prev.next;
            count2++;
        }
        int val = last.val;
        prev.next = last.next;
        last.next.prev = last.prev;
        return val;
    }


    // DISPLAY THE DOUBLY LL

    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val+"->");
            node = node.next;
        }

        System.out.println("END");
    }


    // DISPLAY THE DOUBLY LL IN REVERSE

    public void displayRev(){
        Node node = head;
        Node last=null;
        while(node!=null){
            last= node;
            node=node.next;
        }

        while(last!=null){
            System.out.print(last.val+"<-");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val, DoublyLL.Node next, DoublyLL.Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
        public Node(int val) {
            this.val = val;
        }

    }

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.val == value){
                return node;
            }

            node = node.next;
        }

        return null;
    }
}
