class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        n = len(rooms)
        vis = n*[False]
        cnt = 0
        def dfs(rooms, vis, node):
            vis[node] = True
            for i in range(len(rooms[node])):
                room = rooms[node][i]
                if not vis[room]:
                    dfs(rooms, vis, rooms[node][i])
            return

        for i in range(n):
            if not vis[i]:
                dfs(rooms, vis, i)
                cnt+=1
            if cnt>1:
                return False
        
        return True


        

        