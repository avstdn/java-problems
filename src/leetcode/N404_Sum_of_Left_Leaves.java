package leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 * Find the sum of all left leaves in a given binary tree.
 *
 * Example:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
public class N404_Sum_of_Left_Leaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int result = 0;

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) result += root.left.val;
            else result += sumOfLeftLeaves(root.left);
        }

        result += sumOfLeftLeaves(root.right);

        return result;
    }
}
// https://leetcode.com/problems/sum-of-left-leaves/