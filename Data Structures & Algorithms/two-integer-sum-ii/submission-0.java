class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // left and right pointer
        int left = 0;
        int right = numbers.length - 1;

        // initial sum
        int sum = numbers[left] + numbers[right];

        // if sum = target, ret left, right
        while(sum != target) {
            if(sum > target) {
                sum -= numbers[right];
                right--;
                sum += numbers[right];
            }
            if(sum < target) {
                sum -= numbers[left];
                left++;
                sum += numbers[left];
            }
        }
        return new int[]{1 + left, 1 + right};

        
    }
}
