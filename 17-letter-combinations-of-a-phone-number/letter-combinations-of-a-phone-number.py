class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        col = dict()
        col[2] = ["a", "b", "c"]
        col[3] = ["d", "e", "f"]
        col[4] = ["g", "h", "i"]
        col[5] = ["j", "k", "l"]
        col[6] = ["m", "n", "o"]
        col[7] = ["p", "q", "r", "s"]
        col[8] = ["t", "u", "v"]
        col[9] = ["w", "x", "y", "z"]

        def dfs(digits, idx, n, ans, temp):
            if idx>=n:
                ans.append(temp)
                return
                digitHash = col[int(digits[idx])]

            digitHash = col[int(digits[idx])]
            for ch in digitHash:
                temp += ch
                dfs(digits, idx + 1, n, ans, temp)
                temp = temp[:-1]
            

        temp = ""
        ans = []
        n = len(digits)
        if digits=="":
            return ans
        dfs(digits, 0, n, ans, temp)
        return ans






        