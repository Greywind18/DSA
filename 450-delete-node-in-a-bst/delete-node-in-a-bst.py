# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        def solve(node):
            if not node.left and not node.right:
                return None
            
            if not node.left:
                return node.right
            
            if not node.right:
                return node.left

            temp1 = findRight(node.left)
            temp1.right = node.right
            return node.left            

        
        
        def findRight(node):
            while node.right:
                node = node.right
            
            return node

        if not root:
            return None
        if root.val==key:
            return solve(root)
        parent = root
        temp = root
        while temp:
            if temp.val>key:
                parent = temp
                temp = temp.left
            elif temp.val<key:
                parent = temp
                temp = temp.right
            else:
                if parent.left and parent.left.val == key:
                    parent.left = solve(temp)
                elif parent.right and parent.right.val == key:
                    parent.right = solve(temp)
                break
        
        return root
        
        