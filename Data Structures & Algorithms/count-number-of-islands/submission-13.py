class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        numIslands = 0
        ROWS = len(grid)
        COLS = len(grid[0])
        visited = set()

        def bfs(row, col):
            q = collections.deque()
            q.append((row, col))
            visited.add((row, col))

            directions = [[1, 0], [-1, 0], [0, 1], [0, -1]]
            while q:
                r, c = q.popleft()
                for dir in directions:
                    nr, nc = r + dir[0], c + dir[1]

                    if nr in range(ROWS) and nc in range(COLS) and ((nr, nc)) not in visited and grid[nr][nc] == "1":
                        q.append((nr, nc))
                        visited.add((nr, nc))


        for row in range(ROWS):
            for col in range(COLS):
                if grid[row][col] == "1" and ((row, col)) not in visited:
                    bfs(row, col)
                    numIslands += 1

        return numIslands
