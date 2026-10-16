class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        numIslands = 0
        rows = len(grid)
        cols = len(grid[0])
        visited = set()


        def bfs(r, c):
            q = collections.deque()
            visited.add((r, c))
            q.append((r, c))

            directions = [[1, 0], [-1, 0], [0, 1], [0, -1]]
            for dir in directions:
                nr = r + dir[0]
                nc = c + dir[1]
                if nr in range(rows) and nc in range(cols) and ((nr, nc)) not in visited and grid[nr][nc] == "1":
                    bfs(nr, nc)
                



        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == "1" and ((row, col)) not in visited:
                    bfs(row, col)
                    numIslands += 1

        return numIslands