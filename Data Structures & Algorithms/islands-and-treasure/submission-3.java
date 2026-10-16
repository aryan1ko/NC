class Solution {
    private static final int INF = Integer.MAX_VALUE;
    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(grid[r][c] == 0) {
                    q.add(new int[]{r, c});
                }
            }
        }
        
        if(q.size() == 0) {
            return;
        }

        while(!q.isEmpty()) {
            int arr[] = q.poll();
            int row = arr[0];
            int col = arr[1];

            for(int[] dir : directions) {
                int nr = row + dir[0];
                int nc = col + dir[1];

                if(nr < 0 || nc < 0 || nr >= grid.length ||
                    nc >= grid[0].length || grid[nr][nc] != INF) {
                        continue;
                    }

                    q.add(new int[] {nr, nc});

                    grid[nr][nc] = grid[row][col] + 1;
            }
        }
    }
}
