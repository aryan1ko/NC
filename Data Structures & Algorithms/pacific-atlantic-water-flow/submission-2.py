class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        ROWS = len(heights)
        COLS = len(heights[0])
        pacific = set()
        atlantic = set()
        result = []

        def dfs(row, col, visited, prevHeight):
            if row in range(ROWS) and col in range(COLS) and ((row, col)) not in visited and prevHeight <= heights[row][col]:
                visited.add((row, col))
                directions = [[-1, 0], [1, 0], [0, -1], [0, 1]]

                for dir in directions:
                    nr, nc = row + dir[0], col + dir[1]

                    dfs(nr, nc, visited, heights[row][col])



        for col in range(COLS):
            dfs(0, col, pacific, heights[0][col])
            dfs(ROWS - 1, col, atlantic, heights[ROWS - 1][col])
            
        for row in range(ROWS):
            dfs(row, 0, pacific, heights[row][0])
            dfs(row, COLS - 1, atlantic, heights[row][COLS - 1])


        for r in range(ROWS):
            for c in range(COLS):
                if ((r, c)) in pacific and ((r, c)) in atlantic:
                    result.append([r, c])

        return result
        
