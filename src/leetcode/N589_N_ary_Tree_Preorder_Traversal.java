package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

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
 * }
 *
 * Given an n-ary tree, return the preorder traversal of its nodes' values.
 *
 * For example, given a 3-ary tree:
 *        1
 *       /|\
 *      / | \
 *     3  2  4
 *    / \
 *   5   6
 * Return its preorder traversal as: [1,3,5,6,2,4].
 */
public class N589_N_ary_Tree_Preorder_Traversal {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) return list;

        Deque<Node> deque = new ArrayDeque<>();
        deque.push(root);

        while (!deque.isEmpty()) {
            root = deque.pop();
            list.add(root.val);

            for (int i = root.children.size() - 1; i >= 0; i--) {
                deque.push(root.children.get(i));
            }
        }

        return list;
    }
}
// https://leetcode.com/problems/n-ary-tree-preorder-traversal/