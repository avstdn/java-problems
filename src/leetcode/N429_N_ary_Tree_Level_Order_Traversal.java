package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example, given a 3-ary tree:
 *        1
 *      / | \
 *     3  2  4
 *    / \
 *   5   6
 *
 * We should return its level order traversal:
 * [
 *      [1],
 *      [3,2,4],
 *      [5,6]
 * ]
 *
 * Definition for a Node.
 * class Node {
 *     public int val;
 *     public List<Node> children;
 *
 *     public Node() {}
 *
 *     public Node(int _val, List<Node> _children) {
 *         val = _val;
 *         children = _children;
 *     }
 * };
 */
public class N429_N_ary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++){
                temp.add(queue.peek().val);
                queue.addAll(queue.poll().children);
            }
            result.add(temp);
        }
        return result;
    }
}
// https://leetcode.com/problems/n-ary-tree-level-order-traversal/submissions/