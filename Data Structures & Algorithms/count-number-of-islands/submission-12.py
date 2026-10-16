class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        numIslands = 0
        ROWS = len(grid)
        COLS = len(grid[0])
        visited = set()

        def dfs(r, c):
            visited.add((r, c))


            directions = [[1, 0], [-1, 0], [0, 1], [0, -1]]
            for dir in directions:
                nr, nc = r + dir[0], c + dir[1]
                if nr in range(ROWS) and nc in range(COLS) and grid[nr][nc] == "1" and ((nr, nc)) not in visited:
                    dfs(nr, nc) 


        for row in range(ROWS):
            for col in range(COLS):
                if ((row, col)) not in visited and grid[row][col] == "1":
                    dfs(row, col)
                    numIslands += 1
        
        return numIslands