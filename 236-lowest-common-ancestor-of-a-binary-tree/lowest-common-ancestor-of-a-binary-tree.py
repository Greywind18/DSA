# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if root == p or root == q or not root:
            return root
        temp1 = self.lowestCommonAncestor(root.left, p, q)
        temp2 = self.lowestCommonAncestor(root.right, p, q)
        if not temp1:
            return temp2
        elif not temp2:
            return temp1
        else:
            return root
        