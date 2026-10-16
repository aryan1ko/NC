class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Set<Double> set = new HashSet<>();
        for(int i = 0; i < position.length; i++) {
            double time = ((double) (target - position[i])) / speed[i];
            set.add(time);
        }
        return set.size();
    }
}
