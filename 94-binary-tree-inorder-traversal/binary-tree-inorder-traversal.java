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
    ArrayList<Integer>list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        func(root);
        return list ;
    }
    void func(TreeNode node){
        if(node==null) return ;
        func(node.left);
        list.add(node.val);
         func(node.right);
    }
}