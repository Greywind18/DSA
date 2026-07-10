class Solution:
    def combinationSum3(self, k: int, n: int) -> List[List[int]]:
        
        def combinations(ans, temp,start, k, total):
            if len(temp)==k and total==0:
                ans.append(list(temp))
                return
            elif total<0:
                return
            
            for i in range(start,10):
                if i not in temp:
                    temp.add(i)
                    combinations(ans, temp,i+1, k, total-i)
                    temp.remove(i)
            
            return
        
        ans = []
        temp = set()
        combinations(ans, temp, 1, k, n)
        return ans
