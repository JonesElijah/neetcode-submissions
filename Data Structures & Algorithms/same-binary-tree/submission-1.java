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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q) != -1;
    }
    private int dfs(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return 0;
        }
        if(p == null){
            return -1;
        }
        if(q == null){
            return -1;
        }
        if(dfs(p.left, q.left) == -1 || dfs(p.right, q.right) == -1) return -1;

        if(q.val == p.val) return 1;
        if(q.val == p.val) return 1;
        dfs(p.left, q.left);
        dfs(p.right, q.right);
        return -1;
    }
}
