package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 * Given a non-empty binary tree, return the average value of the nodes on each level in the
 * form of an array.
 *
 * Example 1:
 * Input:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * Output: [3, 14.5, 11]
 *
 * Explanation:
 * The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11.
 * Hence return [3, 14.5, 11].
 *
 * Note:
 * The range of node's value is in the range of 32-bit signed integer.
 */
public class N637_Average_of_Levels_in_Binary_Tree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        while (!deque.isEmpty()) {
            int n = deque.size();
            double subSum = 0;

            for (int i = 0; i < n; i++) {
                TreeNode node = deque.poll();
                subSum += node.val;

                if (node.left != null) deque.add(node.left);
                if (node.right != null) deque.add(node.right);
            }

            list.add(subSum / n);
        }

        return list;
    }
}
// https://leetcode.com/problems/average-of-levels-in-binary-tree/