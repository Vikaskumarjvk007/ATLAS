import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Day29_BinaryTreeTraversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    private TreeNode root;

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public void inorderTraversal(TreeNode root, List<Integer> result) {
        if (root != null) {
            inorderTraversal(root.left, result);
            result.add(root.val);
            inorderTraversal(root.right, result);
        }
    }

    public void preorderTraversal(TreeNode root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);
            preorderTraversal(root.left, result);
            preorderTraversal(root.right, result);
        }
    }

    public void postorderTraversal(TreeNode root, List<Integer> result) {
        if (root != null) {
            postorderTraversal(root.left, result);
            postorderTraversal(root.right, result);
            result.add(root.val);
        }
    }

    public List<Integer> levelorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            result.add(node.val);

            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Day29_BinaryTreeTraversal tree = new Day29_BinaryTreeTraversal();

        System.out.print("Enter number of nodes: ");
        int n = scanner.nextInt();

        System.out.print("Enter node values: ");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            tree.root = tree.insert(tree.root, val);
        }

        List<Integer> inorder = new ArrayList<>();
        tree.inorderTraversal(tree.root, inorder);
        System.out.println("Inorder traversal: " + inorder);

        List<Integer> preorder = new ArrayList<>();
        tree.preorderTraversal(tree.root, preorder);
        System.out.println("Preorder traversal: " + preorder);

        List<Integer> postorder = new ArrayList<>();
        tree.postorderTraversal(tree.root, postorder);
        System.out.println("Postorder traversal: " + postorder);

        List<Integer> levelorder = tree.levelorderTraversal(tree.root);
        System.out.println("Level order traversal: " + levelorder);

        scanner.close();
    }
}