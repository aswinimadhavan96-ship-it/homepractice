package treebasic;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    public void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public void preorder(Node root) {

        if (root == null)
            return;

        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root) {

        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    public void levelOrder(Node root) {

        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node current = queue.poll();

            System.out.print(current.value + " ");

            if (current.left != null)
                queue.add(current.left);

            if (current.right != null)
                queue.add(current.right);
        }
    }
}