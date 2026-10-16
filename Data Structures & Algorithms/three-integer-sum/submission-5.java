class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Set<String> set = new HashSet<>();

        // sort
        Arrays.sort(nums);


        for(int i = 0; i < nums.length - 2; i++) {
            // if(i != 0) {
            //     while(i < nums.length - 2 && nums[i] == nums[i - 1]) {
            //         i++;
            //     }
            // }

            int l = i+1;
            int r = nums.length - 1;

            int target = 0 - nums[i];

            while(l < r) {
                int sum = nums[l] + nums[r];
                if(sum < target) {
                    l++;
                }
                else if(sum > target) {
                    r--;
                }
                else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(nums[i]);
                    sb.append("*");
                    sb.append(nums[l]);
                    sb.append("*");
                    sb.append(nums[r]);
                    sb.append("*");
                    String arrangement = sb.toString();

                    if(!set.contains(arrangement)) {
                        res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        set.add(arrangement);
                    }
                    l++;
                    r--;
                }
            }
        }

        return res;
    }
}
