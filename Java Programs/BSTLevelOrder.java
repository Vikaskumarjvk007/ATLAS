import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BSTLevelOrder {
    Node root;

    // Insert method for BST
    public Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);
        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);
        return root;
    }

    // Level order traversal
    public void levelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        BSTLevelOrder bst = new BSTLevelOrder();
        int[] values = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100, 114 };
        for (int v : values)
            bst.root = bst.insert(bst.root, v);
        bst.levelOrder(bst.root);
    }
}
