// Task 4: Java program to insert an element in a Red-Black Tree
class RBNode {
    int data;
    RBNode left, right, parent;
    boolean isRed;

    RBNode(int data) {
        this.data = data;
        this.isRed = true; // New nodes are red by default
    }
}

public class Task004_RedBlackTreeDemo {
    private RBNode root;

    // Left rotate
    private void leftRotate(RBNode x) {
        RBNode y = x.right;
        x.right = y.left;
        if (y.left != null)
            y.left.parent = x;
        y.parent = x.parent;
        if (x.parent == null)
            root = y;
        else if (x == x.parent.left)
            x.parent.left = y;
        else
            x.parent.right = y;
        y.left = x;
        x.parent = y;
    }

    // Right rotate
    private void rightRotate(RBNode y) {
        RBNode x = y.left;
        y.left = x.right;
        if (x.right != null)
            x.right.parent = y;
        x.parent = y.parent;
        if (y.parent == null)
            root = x;
        else if (y == y.parent.left)
            y.parent.left = x;
        else
            y.parent.right = x;
        x.right = y;
        y.parent = x;
    }

    // Insert node
    public void insert(int data) {
        RBNode node = new RBNode(data);
        root = bstInsert(root, node);
        fixViolation(node);
    }

    // Standard BST insert
    private RBNode bstInsert(RBNode root, RBNode node) {
        if (root == null)
            return node;
        if (node.data < root.data) {
            root.left = bstInsert(root.left, node);
            root.left.parent = root;
        } else if (node.data > root.data) {
            root.right = bstInsert(root.right, node);
            root.right.parent = root;
        }
        return root;
    }

    // Fix Red-Black Tree violations
    private void fixViolation(RBNode z) {
        while (z != root && z.parent.isRed) {
            if (z.parent == z.parent.parent.left) {
                RBNode y = z.parent.parent.right;
                if (y != null && y.isRed) {
                    z.parent.isRed = false;
                    y.isRed = false;
                    z.parent.parent.isRed = true;
                    z = z.parent.parent;
                } else {
                    if (z == z.parent.right) {
                        z = z.parent;
                        leftRotate(z);
                    }
                    z.parent.isRed = false;
                    z.parent.parent.isRed = true;
                    rightRotate(z.parent.parent);
                }
            } else {
                RBNode y = z.parent.parent.left;
                if (y != null && y.isRed) {
                    z.parent.isRed = false;
                    y.isRed = false;
                    z.parent.parent.isRed = true;
                    z = z.parent.parent;
                } else {
                    if (z == z.parent.left) {
                        z = z.parent;
                        rightRotate(z);
                    }
                    z.parent.isRed = false;
                    z.parent.parent.isRed = true;
                    leftRotate(z.parent.parent);
                }
            }
        }
        root.isRed = false;
    }

    // Inorder traversal with color display
    public void inorder(RBNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + (node.isRed ? "(R) " : "(B) "));
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        Task004_RedBlackTreeDemo tree = new Task004_RedBlackTreeDemo();
        int[] values = { 10, 20, 30, 15, 25, 5, 1 };
        for (int v : values)
            tree.insert(v);
        System.out.print("Inorder traversal (R=Red, B=Black): ");
        tree.inorder(tree.root);
        System.out.println();
    }
}
