class BinarySearchTree {
    TreeNode root;

    // Insert if the tree is empty
    void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            insertVal(root, value);
        }
    }

    // Insert if the tree has 1 or more nodes
    TreeNode insertVal(TreeNode node, int value) {
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }
        if (value < node.value) {
            node.left = insertVal(node.left, value);
        } else if (value > node.value) {
            node.right = insertVal(node.right, value);
        }
        return node;
    }

    // Inorder traversal
    void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }
}
