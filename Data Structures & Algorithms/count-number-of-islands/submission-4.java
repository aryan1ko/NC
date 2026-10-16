class Solution {
    private final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int numIslands(char[][] grid) {
        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(grid[r][c] == '1') {
                    numIslands++;
                    bfs(grid, r, c, rows, cols);
                }
            }
        }
        return numIslands;
    }

    private void bfs(char[][] grid, int r, int c, int rows, int cols) {
        grid[r][c] = '0';

        for(int[] dir : directions) {
            int nr = r + dir[0];
            int nc = c + dir[1];

            if(nr >= 0 && nc >= 0 && nr < rows &&
                nc < cols && grid[nr][nc] == '1') {
                    bfs(grid, nr, nc, rows, cols);
            }
        }
    }
}
