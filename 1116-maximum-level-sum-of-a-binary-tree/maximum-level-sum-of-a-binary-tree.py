# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        queue = deque()
        ans = float('-inf')
        ansIdx = 0
        idx = 0
        if not root:
            return ans
        queue.append(root)
        while queue:
            n = len(queue)
            temp = 0
            for i in range(n):
                node = queue.popleft()
                temp+=node.val
                if node.left:
                    queue.append(node.left)
                if(node.right):
                    queue.append(node.right)
            if temp>ans:
                ans = temp
                ansIdx = idx
            idx+=1
        
        return ansIdx + 1