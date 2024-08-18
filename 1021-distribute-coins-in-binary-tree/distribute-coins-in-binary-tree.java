/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int num_moves;

    public int distributeCoins(TreeNode root) 
    {
        num_moves=0;
        give_coins(root);

        return num_moves;        
    }

    public int give_coins(TreeNode node)
    {
        if(node==null) return 0;

        int left=give_coins(node.left);
        int right=give_coins(node.right);
        num_moves+=Math.abs(left)+Math.abs(right);

        return node.val+left+right-1;
    }
}