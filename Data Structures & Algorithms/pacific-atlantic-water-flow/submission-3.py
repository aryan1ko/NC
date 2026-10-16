class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        ROWS = len(heights)
        COLS = len(heights[0])
        pacific = set()
        atlantic = set()
        res = []

        def dfs(row, col, visited, prevHeight):
            visited.add((row, col))
            directions = [[1, 0], [-1, 0], [0, 1], [0, -1]]

            for x, y in directions:
                nr, nc = row + x, col + y

                if nr in range(ROWS) and nc in range(COLS) and ((nr, nc)) not in visited and heights[nr][nc] >= prevHeight:
                    dfs(nr, nc, visited, heights[nr][nc])

        for col in range(COLS):
            dfs(0, col, pacific, heights[0][col])
            dfs(ROWS - 1, col, atlantic, heights[ROWS - 1][col])

        for row in range(ROWS):
            dfs(row, 0, pacific, heights[row][0])
            dfs(row, COLS - 1, atlantic, heights[row][COLS - 1])
        
        for r in range(ROWS):
            for c in range(COLS):
                if ((r, c)) in pacific and ((r, c)) in atlantic:
                    res.append([r, c])

        return res