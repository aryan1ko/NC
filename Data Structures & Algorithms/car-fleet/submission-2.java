class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] arr = new int[position.length][2];
        for(int i = 0; i < position.length; i++) {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));

        int fleets = 0;
        double currTime = 0;
        for(int i = 0; i < position.length; i++) {
            double time = ((double) (target - arr[i][0])) / arr[i][1];
            if(time > currTime) {
                currTime = time;
                fleets++;
            }
        }
        return fleets;
    }
}
