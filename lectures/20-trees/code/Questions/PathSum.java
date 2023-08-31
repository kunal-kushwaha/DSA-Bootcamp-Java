class PathSum {
  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }
    if (root.val == sum && root.left == null && root.right == null) {
      return true;
    }
    return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
  }

  public int sumNumbers(TreeNode root) {
    return helper(root, 0);
  }
  int helper(TreeNode node, int sum) {
    if(node == null) {
      return 0;
    }
    sum = sum * 10 + node.val;
    if (node.left == null && node.right == null) {
      return sum;
    }
    return helper(node.left, sum) + helper(node.right, sum);
  }

  int ans = Integer.MIN_VALUE;
  public int maxPathSum(TreeNode root) {
      helper(root);
      return ans;
  }
  int helper(TreeNode node) {
    if(node == null) {
      return 0;
    }

    int left = helper(node.left);
    int right = helper(node.right);

    left = Math.max(0, left);
    right = Math.max(0, right);

    int pathSum = left + right + node.val;

    ans = Math.max(ans, pathSum);

    return Math.max(left, right) + node.val;
  }

  boolean findPath(Node node, int[] arr) {
    if (node == null) {
      return arr.length == 0;
    }
    return helper(node, arr, 0);
  }
  boolean helper(Node node, int[] arr, int index) {
    if(node == null) {
      return false;
    }
    if(index >= arr.length || node.val != arr[index]) {
      return false;
    }
    if(node.left == null && node.right == null && index = arr.length - 1) {
      return true;
    } 
    return helper(node.left, arr, index + 1) || helper(node.right, arr, index + 1);
  }

  int countPaths(Node node, int sum) {
    List<Integer> path = new ArrayList<>();
    return helper(node, sum, path);
  }
  int helper(Node node, int sum, List<Integer> path) {
    if(node == null) {
      return 0;
    }

    path.add(node.val);
    int count = 0;
    int s = 0;
    // how many paths I can make
    ListIterator<Integer> itr = path.listIterator(path.size());
    while (itr.hashPrevious()) {
      s += itr.previous();

      if (s == sum) {
        count++;
      }
    }

    count += helper(node.left, s, path) + helper(node.right, sum, path);

    // backtrack
    path.remove(path.size() - 1);
    return count;
    
  }

  // put in a list
  List<List<Integer>> findPaths(Node node, int sum) {
    List<List<Integer>> paths = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    helper(node, sum, path);
    return paths;
  }
  void helper(Node node, int sum, List<Integer> path, List<List<Integer>> paths) {
    if(node == null) {
      return 0;
    }

    path.add(node.val);

    if (node.val == sum && node.left == null && node.right == null) {
      paths.add(new ArrayList<>(path));
    } else {
      helper(node.left, sum-node.val, path, paths);
      helper(node.right, sum-node.val, path, paths);
    }

    // backtrack
    path.remove(path.size() - 1);    
  }  
}