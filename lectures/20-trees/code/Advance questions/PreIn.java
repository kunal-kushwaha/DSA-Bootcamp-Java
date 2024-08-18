class PreIn {

  public TreeNode buildTree(int[] preOrder, int[] inOrder) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0; i < inOrder.length; i++) {
      map.put(inOrder[i], i);
    }

    int[] index = {0};
    
    return helper(preOrder, inOrder, 0, preOrder.length-1, map, index);
  }

  public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> map, int[] index) {
    if (left > right) {
      return null;
    }

    int current = preOrder[index[0]];
    index[0]++;

    TreeNode node = new TreeNode(current);

    if (left == right) {
      return node;
    }

    node.left = helper(preOrder, inOrder, left, index - 1, map, index);
    node.right = helper(preOrder, inOrder, index + 1, right, map, index);

    return node;
  }
}