class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // iterate through list from 0 to < nums - 2
        int rep = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            // set L and R pointers
            if(rep != nums[i]) {
                int left = i + 1;
                int right = nums.length - 1;
                while(right > left) {
                    if(nums[i] + nums[left] + nums[right] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        result.add(temp);

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
                rep = nums[i];
            }
        }
        // -4, -1, -1, -1, -1, 0, 1, 2




        return result;
    }
}

