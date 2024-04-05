class PreIn {

  public TreeNode buildTree(int[] preOrder, int[] inOrder) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0; i < inOrder.length; i++) {  // putting the value of array inorder in a hashmap map
      map.put(inOrder[i], i);
    }

    int index = 0;
    
    return helper(preOrder, inOrder, 0, preOrder.length-1, map, index);
  }

  public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> map, index) {
    if (left > right) {
      return null;
    }

    int current = preOrder[index];
    index++;

    TreeNode node = new TreeNode(current);

    if (left == right) {
      return node;
    }
    int inorderindex = map.get(current); // getting the index of preorder content in inorder array, this will get the position of the root node 
    node.left = helper(preOrder, inOrder, left, inorderindex - 1, map, index);
    node.right = helper(preOrder, inOrder, inorderindex + 1, right, map, index);

    return node;
  }
}
