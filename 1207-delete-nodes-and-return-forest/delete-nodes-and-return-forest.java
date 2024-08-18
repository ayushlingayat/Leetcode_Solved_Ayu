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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) 
    {
        List<TreeNode> res=new LinkedList<>();
        Deque<TreeNode> q=new ArrayDeque<>();

        q.offer(root);
        Set<Integer> set=new HashSet<>();

        for(int d:to_delete)
        {
            set.add(d);
        }

        res.add(root);

        while(!q.isEmpty())
        {
            TreeNode cur=q.poll();

            if(set.contains(cur.val))
            {
                res.remove(cur);

                if(cur.left!=null) res.add(cur.left);

                if(cur.right!=null) res.add(cur.right);
            }

            if(cur.left!=null)
            {
                q.offer(cur.left);

                if(set.contains(cur.left.val))
                {
                    cur.left=null;
                }
            }

            if(cur.right!=null)
            {
                q.offer(cur.right);

                if(set.contains(cur.right.val))
                {
                    cur.right=null;
                }
            }
        }
        
        return res;
    }
}