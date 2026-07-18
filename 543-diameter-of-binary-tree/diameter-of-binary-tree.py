# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.ans = 0
        def solve(node, ans):
            if not node:
                return 0
            
            left = solve(node.left, self.ans)
            right = solve(node.right, self.ans)
            self.ans = max(self.ans, left + right)
            return 1 + max(left, right)
        
        solve(root, self.ans)
        return self.ans


        