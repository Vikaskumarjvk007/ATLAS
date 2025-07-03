// Task 7: Deletion in Binary Search Tree
class TreeNode {
    int item;
    TreeNode left, right;

    TreeNode(int item) {
        this.item = item;
        left = right = null;
    }
}

public class BinarySearchTreeOp02 {
    TreeNode root;

    public BinarySearchTreeOp02() {
        this.root = null;
    }

    // Insert a node
    public void insert(int item) {
        root = insertRec(root, item);
    }

    private TreeNode insertRec(TreeNode root, int item) {
        if (root == null) {
            root = new TreeNode(item);
            return root;
        }
        if (item < root.item)
            root.left = insertRec(root.left, item);
        else if (item > root.item)
            root.right = insertRec(root.right, item);
        return root;
    }

    // Search for a node
    public TreeNode search(int key) {
        TreeNode current = root;
        while (current != null) {
            if (key == current.item) {
                return current;
            } else if (key < current.item) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }

    // Delete a node
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private TreeNode deleteRec(TreeNode root, int key) {
        if (root == null)
            return root;
        if (key < root.item)
            root.left = deleteRec(root.left, key);
        else if (key > root.item)
            root.right = deleteRec(root.right, key);
        else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // Node with two children: get inorder successor (smallest in the right subtree)
            root.item = minValue(root.right);
            root.right = deleteRec(root.right, root.item);
        }
        return root;
    }

    private int minValue(TreeNode root) {
        int minv = root.item;
        while (root.left != null) {
            minv = root.left.item;
            root = root.left;
        }
        return minv;
    }

    // Inorder traversal
    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.item + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTreeOp02 bst = new BinarySearchTreeOp02();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder before deletion: ");
        bst.inorder(bst.root);
        System.out.println();

        System.out.println("\nDelete 20");
        bst.delete(20);
        System.out.print("Inorder after deleting 20: ");
        bst.inorder(bst.root);
        System.out.println();

        System.out.println("\nDelete 30");
        bst.delete(30);
        System.out.print("Inorder after deleting 30: ");
        bst.inorder(bst.root);
        System.out.println();

        System.out.println("\nDelete 50");
        bst.delete(50);
        System.out.print("Inorder after deleting 50: ");
        bst.inorder(bst.root);
        System.out.println();
    }
}
