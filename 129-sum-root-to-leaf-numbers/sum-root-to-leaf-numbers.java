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
    private int sum(TreeNode root, String sum){
        if(root==null) return 0;
        sum=sum+root.val;
        if(root.left==null && root.right==null){
            return Integer.parseInt(sum);
        }

        int left=sum(root.left,sum);
        int right=sum(root.right,sum);
        return left+right;
    }
    public int sumNumbers(TreeNode root) {
       return sum(root,"");
    }
}