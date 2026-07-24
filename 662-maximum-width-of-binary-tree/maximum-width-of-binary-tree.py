# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def widthOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        queue = deque()
        queue.append((root,0))
        ans = 1
        while queue:
            n = len(queue)
            startNode = -1
            endNode = -1
            firstNode, fidx = queue[0]
            lidx = 0
            for i in range(n):
                currNode, idx = queue.popleft()
                lidx = idx
                if currNode.left:
                    queue.append((currNode.left, 2*idx+1))
                if currNode.right:
                    queue.append((currNode.right, 2*idx+2))
            
            ans = max(ans, lidx-fidx+1)
        
        return ans





        