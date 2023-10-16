package com.kunal;

public class LL {

    private Node head; // Reference to the first node in the linked list
    private Node tail; // Reference to the last node in the linked list
    private int size; // Keeps track of the number of nodes in the linked list

    public LL() {
        this.size = 0; // Constructor to initialize the size to 0
    }

    public void insertFirst(int val) {
        Node node = new Node(val); // Create a new node with the specified value
        node.next = head; // Set the new node's next reference to the current head
        head = node; // Update the head to point to the new node

        if (tail == null) {
            tail = head; // If this is the first node, also update the tail
        }
        size += 1; // Increase the size of the linked list
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val); // If the list is empty, insert as the first node
            return;
        }
        Node node = new Node(val); // Create a new node with the specified value
        tail.next = node; // Set the current tail's next reference to the new node
        tail = node; // Update the tail to point to the new node
        size++; // Increase the size of the linked list
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val); // If the index is 0, insert at the beginning
            return;
        }
        if (index == size) {
            insertLast(val); // If the index is the size, insert at the end
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next; // Traverse the list to find the node before the target index
        }

        Node node = new Node(val, temp.next); // Create a new node and adjust references
        temp.next = node; // Update the references to insert the new node
        size++; // Increase the size of the linked list
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head); // Call the recursive insert method and update the head
    }

    // Private recursive insert method
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node); // Base case: Insert a new node at the specified index
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next); // Recursively call the method
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst(); // If there's only one node, delete the first
        }

        Node secondLast = get(size - 2); // Find the second-to-last node
        int val = tail.value; // Get the value of the last node
        tail = secondLast; // Update the tail
        tail.next = null; // Remove the reference to the old last node
        size--; // Decrease the size of the linked list
        return val; // Return the value of the deleted node
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst(); // If the index is 0, delete the first node
        }
        if (index == size - 1) {
            return deleteLast(); // If the index is the size - 1, delete the last node
        }

        Node prev = get(index - 1); // Find the node before the target index
        int val = prev.next.value; // Get the value of the node to be deleted

        prev.next = prev.next.next; // Adjust references to remove the node
        size--; // Decrease the size of the linked list
        return val; // Return the value of the deleted node
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node; // Find and return the node with the specified value
            }
            node = node.next; // Move to the next node
        }
        return null; // Value not found in the linked list
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next; // Traverse the list to find the node at the specified index
        }
        return node; // Return the node at the specified index
    }

    public int deleteFirst() {
        int val = head.value; // Get the value of the first node
        head = head.next; // Update the head to the next node
        if (head == null) {
            tail = null; // If the list is now empty, update the tail
        }
        size--; // Decrease the size of the linked list
        return val; // Return the value of the deleted node
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> "); // Print the value of each node
            temp = temp.next; // Move to the next node
        }
        System.out.println("END"); // Print "END" to mark the end of the list
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value; // Constructor for creating a node with a value
        }

        public Node(int value, Node next) {
            this.value = value; // Constructor for creating a node with a value and a next node reference
            this.next = next;
        }
    }

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next; // Remove duplicate nodes
                size--; // Decrease the size of the linked list
            } else {
                node = node.next; // Move to the next node
            }
        }
        tail = node; // Update the tail
        tail.next = null; // Remove the reference to the old last duplicate
    }

    // https://leetcode.com/problems/merge-two-sorted-lists/submissions/
    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL(); // Create a new linked list for the merged result

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value); // Insert the smaller value from the first list
                f = f.next; // Move to the next node in the first list
            } else {
                ans.insertLast(s.value); // Insert the smaller value from the second list
                s = s.next; // Move to the next node in the second list
            }
        }

        while (f != null) {
            ans.insertLast(f.value); // Insert remaining nodes from the first list
            f = f.next; // Move to the next node in the first list
        }

        while (s != null) {
            ans.insertLast(s.value); // Insert remaining nodes from the second list
            s = s.next; // Move to the next node in the second list
        }

        return ans; // Return the merged linked list
    }

    public void bubbleSort() {
        bubbleSort(size - 1, 0); // Start the bubble sort algorithm
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return; // If only one row left, the list is sorted
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second; // Update the head
                    first.next = second.next; // Adjust references for the swap
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second; // Update references for the swap
                    tail = first; // Update the tail
                    first.next = null; // Remove the reference to the old last node
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second; // Update references for the swap
                    first.next = second.next; // Adjust references for the swap
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1); // Recursively continue the sorting
        } else {
            bubbleSort(row - 1, 0); // Move to the next row
        }
    }

    // Recursively reverse the linked list
    private void reverse(Node node) {
        if (node == tail) {
            head = tail; // Update the head
            return;
        }
        reverse(node.next); // Recursively reverse the list
        tail.next = node; // Update references for the reverse
        tail = node; // Update the tail
        tail.next = null; // Remove the reference to the old last node
    }

    // In-place reversal of linked list
    // LeetCode problem: https://leetcode.com/problems/reverse-linked-list/
    public void reverse() {
        if (size < 2) {
            return; // If there are 0 or 1 elements, no need to reverse
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev; // Reverse the references
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev; // Update the head to the new first node
    }

    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = LL.merge(first, second); // Merge two sorted lists
        ans.display(); // Display the merged list

        LL list = new LL();
        for (int i = 7; i > 0; i--) {
            list.insertLast(i); // Insert values into a new list
        }
        list.display(); // Display the unsorted list
        list.bubbleSort(); // Sort the list using bubble sort
        list.display(); // Display the sorted list
    }
}
