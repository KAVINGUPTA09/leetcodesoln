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
    private int heighttree(TreeNode root){
        if(root==null) return 0;
        int l=heighttree(root.left);
        int r=heighttree(root.right);
        return 1+Math.max(l,r);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int ll=heighttree(root.left);
        int rr=heighttree(root.right);
        if(Math.abs(ll-rr)>1){
            return false;
        }
    return isBalanced(root.left) && isBalanced(root.right);
    }
}