class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        // iterate through list from 0 to < nums - 2
        int rep = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length - 2; i++) {
                int left = i + 1;
                int right = nums.length - 1;
                while(right > left) {
                    if(nums[i] + nums[left] + nums[right] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        set.add(temp);

                        //adjust pointers
                        right--;
                        left++;
                    }
                    else if (nums[i] + nums[left] + nums[right] > 0) {
                        right--;
                    }
                    else if (nums[i] + nums[left] + nums[right] < 0) {
                        left++;
                    }
                }
        }
        // -4, -1, -1, -1, -1, 0, 1, 2
        // -2, 0, 0, 2, 2


        for(List<Integer> list : set) {
            result.add(list);
        }

        return result;
    }
}

