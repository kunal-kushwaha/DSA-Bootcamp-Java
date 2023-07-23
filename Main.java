#Trees
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Method to insert a value into the binary tree
    public void insert(int val) {
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }

        if (val < node.val) {
            node.left = insertRec(node.left, val);
        } else if (val > node.val) {
            node.right = insertRec(node.right, val);
        }

        return node;
    }

    // Method to perform inorder traversal of the binary tree
    public void inorderTraversal() {
        inorderTraversalRec(root);
        System.out.println();
    }

    private void inorderTraversalRec(TreeNode node) {
        if (node != null) {
            inorderTraversalRec(node.left);
            System.out.print(node.val + " ");
            inorderTraversalRec(node.right);
        }
    }

    // Method to search for a value in the binary tree
    public boolean search(int val) {
        return searchRec(root, val);
    }

    private boolean searchRec(TreeNode node, int val) {
        if (node == null) {
            return false;
        }

        if (val == node.val) {
            return true;
        } else if (val < node.val) {
            return searchRec(node.left, val);
        } else {
            return searchRec(node.right, val);
        }
    }

    // Method to find the maximum value in the binary tree
    public int findMax() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        return findMaxRec(root);
    }

    private int findMaxRec(TreeNode node) {
        if (node.right != null) {
            return findMaxRec(node.right);
        }

        return node.val;
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert values into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Perform inorder traversal of the binary tree
        System.out.println("Inorder Traversal:");
        tree.inorderTraversal();

        // Search for a value in the binary tree
        int searchValue = 40;
        System.out.println("Searching for " + searchValue + ": " + tree.search(searchValue));

        // Find the maximum value in the binary tree
        System.out.println("Maximum value: " + tree.findMax());
    }
}
