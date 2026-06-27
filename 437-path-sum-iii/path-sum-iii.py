# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        def pathSumCnt(node, currSum):
            if not node:
                return 0
            
            currSum+=node.val
            count=prefix_sums.get(currSum-targetSum, 0)
            prefix_sums[currSum] = prefix_sums.get(currSum,0) + 1
            count+=pathSumCnt(node.left, currSum)
            count+=pathSumCnt(node.right, currSum)
            prefix_sums[currSum]-=1
            return count
        
        prefix_sums={0:1}
        return pathSumCnt(root, 0)
        