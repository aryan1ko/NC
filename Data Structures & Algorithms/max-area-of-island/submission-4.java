class Solution {
    private final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(grid[r][c] == 1) {
                    maxArea = Math.max(maxArea, bfs(grid, r, c));
                }
            }
        }

        return maxArea;
    }

    private int bfs(int[][] grid, int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = 0;
        int res = 1;
        q.add(new int[]{r, c});

        while(!q.isEmpty()) {
            int[] arr = q.poll();
            int row = arr[0];
            int col = arr[1];

            for(int[] dir : directions) {
                int nr = row + dir[0];
                int nc = col + dir[1];

                if(nr >= 0 && nc >= 0 && nr < grid.length &&
                    nc < grid[0].length && grid[nr][nc] == 1) {
                    grid[nr][nc] = 0;
                    res++;

                    q.add(new int[]{nr, nc});
                }
            }
        }

        return res;
    }


}
