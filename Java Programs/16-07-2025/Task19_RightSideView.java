import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Task19_RightSideView {
    Node root;

    public Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);
        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);
        return root;
    }

    public void printRightSideView(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        System.out.print("Right Side View: ");
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (i == size - 1)
                    System.out.print(node.data + " ");
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task19_RightSideView bst = new Task19_RightSideView();
        int[] values = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100, 114 };
        for (int v : values)
            bst.root = bst.insert(bst.root, v);
        bst.printRightSideView(bst.root);
    }
}
