class Solution {
    private static final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
   
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int maxArea = 0;

        for(int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                maxArea = Math.max(maxArea, dfs(grid, r, c));
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int r, int c) {
        if(r < 0 || c < 0 || r >= grid.length ||
           c >= grid[0].length || grid[r][c] == 0) {
            return 0;
           }

        int res = 1; // we are at a 1
        grid[r][c] = 0;

        for(int[] dir : directions) {
            res += dfs(grid, r + dir[0], c + dir[1]);
        }

        return res;
    }

}
