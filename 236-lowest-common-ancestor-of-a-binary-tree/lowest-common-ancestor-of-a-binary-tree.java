/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans=null;
    private int mylcafunc(TreeNode node,TreeNode p,TreeNode q){

        if(node==null){
            return 0;
        }
        int self=0;
        int left=mylcafunc(node.left,p,q);
        int right=mylcafunc(node.right,p,q);

        if(node==p || node==q){
            self=1;
        }

        int total=self+right+left;

        if(total==2 && ans==null){
            ans=node;
        }

        return total;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        mylcafunc(root,p,q);
        return ans;
        
    }
}