// Task 2: Java code for AVL Tree with insert, left/right rotate, and display
class AVLNode {
    int key, height;
    AVLNode left, right;

    AVLNode(int d) {
        key = d;
        height = 1;
    }
}

public class Task002_AVLTree {
    AVLNode root;

    // Get height of node
    int height(AVLNode N) {
        if (N == null)
            return 0;
        return N.height;
    }

    // Get balance factor
    int getBalance(AVLNode N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    // Right rotate
    AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    // Left rotate
    AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    // Insert node
    AVLNode insert(AVLNode node, int key) {
        if (node == null)
            return new AVLNode(key);
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Duplicate keys not allowed
            return node;
        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);
        // Left Left
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);
        // Right Right
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);
        // Left Right
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // Right Left
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    // Inorder display
    void inorder(AVLNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        Task002_AVLTree tree = new Task002_AVLTree();
        int[] keys = { 10, 20, 30, 40, 50, 25 };
        for (int key : keys) {
            tree.root = tree.insert(tree.root, key);
        }
        System.out.print("Inorder traversal of AVL tree: ");
        tree.inorder(tree.root);
        System.out.println();
    }
}
