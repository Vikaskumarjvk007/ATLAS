public class Main {
    public static void main(String[] args) {
        // Create a BinarySearchTree object
        BinarySearchTree bst = new BinarySearchTree();

        // Insert values into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Print inorder traversal
        System.out.print("Inorder traversal: ");
        bst.inorder(bst.root);
        System.out.println();
    }
}
