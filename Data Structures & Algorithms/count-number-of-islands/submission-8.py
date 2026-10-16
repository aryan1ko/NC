class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        rows = len(grid)
        cols = len(grid[0])
        numIslands = 0
        visited  = set()


        def bfs(row, col):
            q = collections.deque()
            q.append((row, col))
            visited.add((row, col))

            directions = [[0, -1], [0, 1], [1, 0], [-1, 0]]

            while q:
                r, c = q.popleft()
                for dir in directions:
                    nr, nc = r + dir[0], c + dir[1]

                    if nr in range(rows) and nc in range(cols) and grid[nr][nc] == "1" and ((nr, nc)) not in visited:
                        q.append((nr, nc))
                        visited.add((nr, nc))




        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == "1" and ((row, col)) not in visited:
                    bfs(row, col)
                    numIslands += 1
        return numIslands