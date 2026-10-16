/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     Tree7Node(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {

        Stack<TreeNode>LeftStack=new Stack<>();
        Stack<TreeNode>RightStack=new Stack<>();

        TreeNode curr=root;

        //phle left part tarvrse krke leftstack me bhardo
        while(curr!=null){
            LeftStack.push(curr);
            curr=curr.left;
        }
        //ab right part traverse krke rightstack me bhardo
        curr=root;
        while(curr!=null){
            RightStack.push(curr);
            curr=curr.right;
        }

        while(!LeftStack.isEmpty() && !RightStack.isEmpty()){

            TreeNode leftpart=LeftStack.peek();
            TreeNode rightpart=RightStack.peek();

            int sum=leftpart.val+rightpart.val;

            if (leftpart == rightpart || leftpart.val >= rightpart.val) {
                break;
            }

            if(sum==k){
                return true;
            }
            else if(sum<k){
                //agar sum<k mtlb mtlb left se pop kro left se right child dekho aur us right child ke left prt ko stack me push kro
                TreeNode node = LeftStack.pop();
                curr = node.right;
                while (curr != null) {
                    LeftStack.push(curr);
                    curr = curr.left;
                }
            }
            else{
                //sum>k wala part isme right ko pop kro phir dekho kya right side ka left hai uspe jao aur us left ke right child ki push krdo
                TreeNode node=RightStack.pop();
                curr=node.left;
                while(curr!=null){
                    RightStack.push(curr);
                    curr=curr.right;
                }
            }
        }
        return false;
    }
}