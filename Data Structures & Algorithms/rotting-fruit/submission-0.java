class Solution {
    private static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int fresh = 0;
        int time = 0;
        Queue<int[]> q = new LinkedList<>();

        for(int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if(grid[r][c] == 1) fresh++;
                if(grid[r][c] == 2) q.add(new int[]{r, c});
            }
        }


        while(!q.isEmpty()) {
            int size = q.size();
            boolean rottedThisMinute = false;
            for(int i = 0; i < size; i++) {
                int arr[] = q.poll();
                int row = arr[0];
                int col = arr[1];

                for(int[] dir : directions) {
                    int nr = row + dir[0];
                    int nc = col + dir[1];

                    if(nr < 0 || nc < 0 || nr >= grid.length ||
                        nc >= grid[0].length || grid[nr][nc] == 2 ||
                        grid[nr][nc] == 0) {
                            continue;
                    }
                    //fresh fruit
                    q.add(new int[]{nr, nc});
                    fresh--;
                    grid[nr][nc] = 2;
                    rottedThisMinute = true;
                }
            }
            if(rottedThisMinute) time++;
        }
        return fresh == 0 ? time : -1;

    }
}
