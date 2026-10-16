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
    private boolean path(TreeNode root,int sum,int targetSum){
        if(root==null){
            return false;
        }
        sum=sum+root.val;
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                return true;
            }
        }
        boolean a=path(root.left,sum,targetSum);
        boolean b=path(root.right,sum,targetSum);
        return a||b;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root,0,targetSum);
}
}