class SegmentTree {

  private static class Node {
    int data;
    int startInterval;
    int endInterval;
    Node left;
    Node right;

    public Node (int startInterval, int endInterval) {
      this.startInterval = startInterval;
      this.endInterval = endInterval;
    }
  }

  Node root;

  public SegmentTree(int[] arr) {
    // create a tree using this array
    this.root = constructTree(arr, 0, arr.length - 1);
  }

  private Node constructTree(int[] arr, int start, int end) {
    if(start == end) {
      // leaf node
      Node leaf = new Node(start, end);
      leaf.data = arr[start];
      return leaf;
    }

    // create new node with index you are at
    Node node = new Node(start, end);
    
    int mid = (start + end) / 2;

    node.left = this.constructTree(arr, start, mid);
    node.right = this.constructTree(arr, mid + 1, end);

    node.data = node.left.data + node.right.data;
    return node;
  }

  public void display() {
    display(this.root);
  }
  private void display(Node node) {
    String str = "";

    if(node.left != null) {
      str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => "; 
    } else {
      str = str + "No left child";
    }

    // for current node
    str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= "; 
    
    if(node.right != null) {
      str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data; 
    } else {
      str = str + "No right child";
    }

    System.out.println(str + '\n');

    // call recursion
    if(node.left != null) {
      display(node.left);
    }

    if(node.right != null) {
      display(node.right);
    }
  }

  // query
  public int query(int qsi, int qei) {
    return this.query(this.root, qsi, qei);
  }
  private int query(Node node, int qsi, int qei) {
    // Node [3,5], Query [2,7]
    // Entire node is inside query
    if(node.startInterval >= qsi && node.endInterval <= qei) {
      return node.data;
    } 

    // completely outside
    if (node.startInterval > qei || node.endInterval < qsi) {
      return 0;
    }

    int left = query(node.left ,qsi,qei);
    int right = query(node.right,qsi,qei);

    return left+right; 
       
    
  }

  // update
  public void update(int index, int value) {
    if (index < root.startInterval || index > root.endInterval) {
       return;
    }
    this.root.data = update(root, index, value);
  }
  
  private int update(Node node, int index, int data) {
        if (node.startInterval == node.endInterval) {
            node.data = data;
            return data;
        }
        int mid = (node.startInterval + node.endInterval) / 2;
        if (index <= mid) {
            update(node.left, index, data);
        } else {
            update(node.right, index, data);
        }

        node.data = node.left.data + node.right.data;
        return node.data;
    }
  
}
