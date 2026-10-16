class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Set<int[]> visited = new HashSet<>();
        Queue<int[]> q = new LinkedList<>();

        //find all gates
        for(int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                visited.add(new int[] {r, c});
            }
        }

        //we now perform bfs starting from each gate

        int dist = 0;
        while(!q.isEmpty) {
            int arr[] = q.poll();
            int row = arr[0];
            int col = arr[1];
            
            // grid(row, col) is always valid here
            grid[row][col] = dist;
            visited.add(arr);

            addRoom(row, col);
            addRoom(row, col);addRoom(row, col);
        }
    }
}
