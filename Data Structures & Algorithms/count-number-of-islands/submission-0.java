class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;


        for(int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if(grid[r][c] == '1') {
                    bfs(grid, r, c);
                    islands++;
                }
            }
        }

        return islands;
    }

    public void bfs(char[][] grid, int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = '0';
        q.add(new int[]{r, c});

        while(!q.isEmpty()) {
            int arr[] = q.poll();
            int row = arr[0];
            int col = arr[1];

            int[][] directions = {{1, 0},{-1, 0}, {0, 1}, {0, -1}};

            for(int[] dir : directions) {
                if(row + dir[0] >= 0 && col + dir[1] >= 0 && 
                   row + dir[0] < grid.length && 
                   col + dir[1] < grid[0].length && 
                   grid[row + dir[0]][col + dir[1]] == '1') {
                    //add to queue
                    q.add(new int[]{row + dir[0], col + dir[1]});

                    //mark as visited (set to 0)
                    grid[row + dir[0]][col + dir[1]] = '0';

                }
            }
        }
    }
    
}
