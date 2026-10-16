class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int start = 0;
        int maxCount = 0;
        int count = 0;
        for(int num : nums) {
            if(!set.contains(num - 1)) {
                count = 1;
                int curr = num;
                while(set.contains(curr + 1)) {
                    count++;
                    curr++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;



    }
}
