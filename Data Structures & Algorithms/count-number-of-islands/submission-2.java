class Solution {
    private final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(grid[r][c] == '1') {
                    dfs(grid, r, c);
                    numIslands++;
                }
            }
        }

        return numIslands;
    }
    
    private void dfs(char[][] grid, int r, int c) {
        //if invalid or 0 return
        if(r < 0 || c < 0 || r >= grid.length ||
           c >= grid[0].length || grid[r][c] == '0') {
            return;
           } 


        grid[r][c] = '0';
        for(int[] dir : directions) {
            dfs(grid, r + dir[0], c + dir[1]);
        }
    }

}
