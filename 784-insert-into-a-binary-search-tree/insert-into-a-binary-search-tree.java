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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
            //mean agar root hi nul hai to us root me req val bhardo
        }
        if(val<root.val){
            root.left=insertIntoBST(root.left,val);
        }
        else if(val>root.val){
            root.right=insertIntoBST(root.right,val);
        }
        return root;

    }
}