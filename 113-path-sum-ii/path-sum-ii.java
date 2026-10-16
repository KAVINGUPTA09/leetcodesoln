import java.util.List;
import java.util.ArrayList;

class Solution {
    private void path(TreeNode root, int sum, int targetSum, List<Integer> currentPath, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        
        // 1. Root se value lo aur sum/path mein add karo
        sum = sum + root.val;
        
        List<Integer> nextPath = new ArrayList<>(currentPath);
        nextPath.add(root.val);
        
        // 2. Check karo agar leaf node hai aur sum target ke barabar hai, toh add kar do
        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                result.add(nextPath);
            }
        }
        
        // 3. Left aur Right dono taraf move karo
        path(root.left, sum, targetSum, nextPath, result);
        path(root.right, sum, targetSum, nextPath, result);
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        path(root, 0, targetSum, new ArrayList<>(), result);
        return result;
    }
}