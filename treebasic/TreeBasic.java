package treebasic;

public class TreeBasic {

    public static void main(String[] args) {

        Node root = new Node(8);

        root.left = new Node(4);
        root.right = new Node(12);

        root.left.left = new Node(2);
        root.left.right = new Node(6);

        root.right.left = new Node(10);
        root.right.right = new Node(14);

        TreeTraversal tt = new TreeTraversal();

        System.out.print("Inorder: ");
        tt.inorder(root);

        System.out.print("\nPreorder: ");
        tt.preorder(root);

        System.out.print("\nPostorder: ");
        tt.postorder(root);

        System.out.print("\nLevel Order: ");
        tt.levelOrder(root);
    }
}