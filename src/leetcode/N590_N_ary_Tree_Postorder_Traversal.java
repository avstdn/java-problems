package leetcode;

import java.util.*;

/**
 * Definition for a Node.
 * class Node {
 *     public int val;
 *     public List<Node> children;
 *
 *     public Node() {}
 *
 *     public Node(int _val,List<Node> _children) {
 *         val = _val;
 *         children = _children;
 *     }
 * };
 *
 * Given an n-ary tree, return the postorder traversal of its nodes' values.
 *
 * For example, given a 3-ary tree:
 *        1
 *       /|\
 *      / | \
 *     3  2  4
 *    / \
 *   5   6
 * Return its postorder traversal as: [5,6,3,2,4,1].
 */
public class N590_N_ary_Tree_Postorder_Traversal {
    public List<Integer> postorder(Node root) {
        if (root == null) return Collections.emptyList();

        List<Integer> list = new ArrayList<>();
        Deque<Node> deque = new ArrayDeque<>();
        deque.push(root);

        while (!deque.isEmpty()) {
            root = deque.pop();
            list.add(root.val);

            for (Node child : root.children) {
                deque.push(child);
            }
        }

        Collections.reverse(list);

        return list;
    }

    public List<Integer> postorderRecursive(Node root) {
        if (root == null) return Collections.emptyList();

        List<Integer> list = new ArrayList<>();
        postorder(root, list);

        return list;
    }

    private void postorder(Node root, List<Integer> list) {
        for (Node child : root.children) {
            postorder(child, list);
        }

        list.add(root.val);
    }
}