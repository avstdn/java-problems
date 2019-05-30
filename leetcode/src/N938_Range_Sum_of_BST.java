/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class N938_Range_Sum_of_BST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if (root == null) return 0;

        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }

        sum += rangeSumBST(root.left, L, R);
        sum += rangeSumBST(root.right, L, R);

        return sum;
    }
}
// https://leetcode.com/problems/range-sum-of-bst/