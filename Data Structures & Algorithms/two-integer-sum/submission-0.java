class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // num, index
        int[] result = new int[2];

        // check if remainder is in map
        // if it is, add index of both to map
        for(int i = 0; i < nums.length; i++) {
            result[0] = i;
            if(map.containsKey(target - nums[i])) {
                result[1] = map.get(target - nums[i]);
                break;
            }
            else {
                map.put(nums[i], i);
            }
        }
        Arrays.sort(result);
        return result;
    }
}
