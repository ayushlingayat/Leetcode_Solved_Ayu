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

    String ans = "";

    public String smallestFromLeaf(TreeNode root) 
    {
        dfs(root, new StringBuilder());

        return ans;
    }

    public void dfs(TreeNode root, StringBuilder curString)
    {
        if(root==null)
        {
            return;
        }

        curString.insert(0,(char)(root.val + 'a'));

        if(root.left == null && root.right==null)
        {
            if(ans=="" || ans.compareTo(curString.toString())>0)
            {
                ans = curString.toString();
            }

            return;
        }

        if(root.left!=null)
        {
            dfs(root.left, curString);
            curString.deleteCharAt(0);
        }
        
        if(root.right!=null)
        {
            dfs(root.right, curString);
            curString.deleteCharAt(0);
        }        
    }
}