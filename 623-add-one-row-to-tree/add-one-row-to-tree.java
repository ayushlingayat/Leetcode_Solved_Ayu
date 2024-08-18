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
    public TreeNode addOneRow(TreeNode root, int val, int depth) 
    {
        TreeNode newRoot = null;

        if(depth==1)
        {
            newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);   
        int curDepth=1;

        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node = queue.poll();

                if(curDepth==depth-1)
                {
                    TreeNode newLeft = new TreeNode(val);
                    newLeft.left = node.left;
                    node.left = newLeft;
                    TreeNode newRight = new TreeNode(val);
                    newRight.right = node.right;
                    node.right = newRight;
                }

                else
                {
                    if(node.left!=null)
                    {
                        queue.offer(node.left);
                    }

                    if(node.right!=null)
                    {
                        queue.offer(node.right);
                    }

                }
            }

            curDepth++;
        }

        return root;
    }
}