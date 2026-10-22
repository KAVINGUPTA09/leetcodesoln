# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def buildTree(self, preorder: list[int], inorder: list[int]) -> TreeNode | None:
        self.preindex = 0
        
        def helper(instart, inend):
            if instart > inend:
                return None
            
            # 1. Find root
            root = TreeNode(preorder[self.preindex])
            self.preindex += 1
            
            # 2. Find index of root in inorder
            inindex = 0
            for i in range(len(inorder)):
                if inorder[i] == root.val:
                    inindex = i
                    break
            
            # 3. Boundaries set karke left aur right attach kiya
            root.left = helper(instart, inindex - 1)
            root.right = helper(inindex + 1, inend)
            
            return root
        
        return helper(0, len(inorder) - 1)