class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Set<Float> set = new HashSet<>();
        for(int i = 0; i < position.length; i++) {
            float time = ((float) (target - position[i])) / speed[i];
            set.add(time);
        }
        return set.size();
    }
}
