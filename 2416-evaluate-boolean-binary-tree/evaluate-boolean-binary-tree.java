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
    public boolean evaluateTree(TreeNode root) 
    {
        if(root.left==null && root.right==null)
        {
            return (root.val==1)?true:false;
        }

        boolean left=false;
        boolean right=false;

        if(root.left!=null)
        {
            left= evaluateTree(root.left);
        }

        if(root.right!=null)
        {
            right = evaluateTree(root.right);
        }

        boolean res=false;

        if(root.val==2)
        {
            res=(left||right)?true:false;
        }

        else if(root.val==3)
        {
            res=(left&&right)?true:false;
        }
        
        return res;
    }
}