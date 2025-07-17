import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Task18_ReverseAlternateLevels {
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

    public void printAlternateReverseLevels(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean reverse = false;
        System.out.print("Alternate Reverse Levels: ");
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                level.add(node.data);
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            if (reverse)
                Collections.reverse(level);
            for (int val : level)
                System.out.print(val + " ");
            reverse = !reverse;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task18_ReverseAlternateLevels bst = new Task18_ReverseAlternateLevels();
        int[] values = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100, 114 };
        for (int v : values)
            bst.root = bst.insert(bst.root, v);
        bst.printAlternateReverseLevels(bst.root);
    }
}
