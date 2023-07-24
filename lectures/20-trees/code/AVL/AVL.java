class AVL {

  public class Node {
    private int value;
    private Node left;
    private Node right;
    private int height;

    public Node(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }

  private Node root;

  public AVL() {

  }

  public int height() {
    return height(root);
  }
  private int height(Node node) {
    if (node == null) {
      return -1;
    }
    return node.height;
  }
  
  public void insert(int value) {
    root = insert(value, root);
  }

  private Node insert(int value, Node node) {
    if (node == null) {
      node = new Node(value);
      return node;
    }

    if (value < node.value) {
      node.left = insert(value, node.left);
    }

    if (value > node.value) {
      node.right = insert(value, node.right);
    }

    node.height = Math.max(height(node.left), height(node.right)) + 1;
    return rotate(node);
  }

  private Node rotate(Node node) {
    if (height(node.left) - height(node.right) > 1) {
      // left heavy
      if(height(node.left.left) - height(node.left.right) > 0) {
        // left left case
        return rightRotate(node);
      }
      if(height(node.left.left) - height(node.left.right) < 0) {
        // left right case
        node.left = leftRotate(node.left);
        return rightRotate(node);
      }
    }

    if (height(node.left) - height(node.right) < -1) {
      // right heavy
      if(height(node.right.left) - height(node.right.right) < 0) {
        // right right case
        return leftRotate(node);
      }
      if(height(node.right.left) - height(node.right.right) > 0) {
        // left right case
        node.right = rightRotate(node.right);
        return leftRotate(node);
      }
    }

    return node;
  }

  public Node rightRotate(Node p) {
    Node c = p.left;
    Node t = c.right;

    c.right = p;
    p.left = t;
    
    p.height = Math.max(height(p.left), height(p.right) + 1);
    c.height = Math.max(height(c.left), height(c.right) + 1);

    return c;
  }

  public Node leftRotate(Node c) {
    Node p = c.right;
    Node t = p.left;

    p.left = c;
    c.right = t;
    
    p.height = Math.max(height(p.left), height(p.right) + 1);
    c.height = Math.max(height(c.left), height(c.right) + 1);

    return p;
  }

  public void populate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      this.insert(nums[i]);
    }
  }

  public void populatedSorted(int[] nums) {
    populatedSorted(nums, 0, nums.length);
  }

  private void populatedSorted(int[] nums, int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;

    this.insert(nums[mid]);
    populatedSorted(nums, start, mid);
    populatedSorted(nums, mid + 1, end);
  }

  public void display() {
    display(this.root, "Root Node: ");
  }

  private void display(Node node, String details) {
    if (node == null) {
      return;
    }
    System.out.println(details + node.value);
    display(node.left, "Left child of " + node.value + " : ");
    display(node.right, "Right child of " + node.value + " : ");
  }

  public boolean isEmpty() {
    return root == null;
  }

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {
    if (node == null) {
      return true;
    }
    return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
  }

}