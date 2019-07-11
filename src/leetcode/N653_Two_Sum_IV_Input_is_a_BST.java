package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 * Given a Binary Search Tree and a target number, return true
 * if there exist two elements in the BST such that their sum is
 * equal to the given target.
 *
 * Example 1:
 *
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 9
 *
 * Output: True
 */
public class N653_Two_Sum_IV_Input_is_a_BST {
    public boolean findTarget(TreeNode root, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : getTreeValues(root)) {
            if (map.containsKey(num)) return true;
            else map.put(k - num, num);
        }

        return false;
    }

    private List<Integer> getTreeValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) return null;

        list.add(root.val);

        if (root.left != null) list.addAll(getTreeValues(root.left));
        if (root.right != null) list.addAll(getTreeValues(root.right));

        return list;
    }
}
// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/