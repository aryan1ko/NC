class Solution {
    private final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(grid[r][c] == '1') {
                    bfs(grid, r, c);
                    numIslands++;
                }
            }
        }

        return numIslands;
    }
    
    private void bfs(char[][] grid, int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c});

        while(!q.isEmpty()) {
            int[] arr = q.poll();
            int row = arr[0];
            int col = arr[1];

            if(row >= 0 && col >= 0 && row < grid.length &&
                col < grid[0].length && grid[row][col] == '1') {
                    grid[row][col] = '0';

                    for(int[] dir : directions) {
                        q.add(new int[]{row + dir[0], col + dir[1]});
                    }
                }
        }
    }

}
