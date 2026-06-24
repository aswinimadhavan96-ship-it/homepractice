package bfss;

import java.util.LinkedList;
import java.util.Queue;

public class BFSS {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        // Starting node
        q.offer("0");

        System.out.println("BFS Traversal:");

        while (!q.isEmpty()) {

            String node = q.poll();

            System.out.print(node + " -> ");

            if (node.equals("0")) {
                q.offer("1");
                q.offer("2");
            }

            else if (node.equals("1")) {
                q.offer("3");
            }

            else if (node.equals("2")) {
                q.offer("4");
            }

            else if (node.equals("3")) {
                // 4 already added through node 2
            }

            else if (node.equals("4")) {
                // No new node
            }
        }
    }
}