import java.util.*;

class Node {
  int val;
  Node left; 
  Node right;
  public Node (int val) {
    this.val = val;
  }
}

public class TwoNodeSwap {
  Node first;
  Node second;
  Node prev;

  public void helper(Node root) {
    iot(root);

    // swap
    int temp = first.val;
    first.val = second.val;
    second.val = temp;
  }

  private void iot(Node node) {
    if(node == null) {
      return;
    }

    iot(node.left);

    if(prev != null && prev.val > node.val) {
      if(first == null) {
        first = prev;
      }
      second = node;
    }

    prev = node;
    
    iot(node.right);
  }

  public void printIOT(Node node) {
    if(node == null) {
      return;
    }
    printIOT(node.left);
    System.out.print(node.val + " ");
    printIOT(node.right);
  }
}