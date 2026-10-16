class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefixArr = [0] * len(nums)
        suffixArr = [0] * len(nums)
        res = []
        
        prefixArr[0] = 1
        for i in range(1, len(nums)):
            prefixArr[i] = prefixArr[i-1] * nums[i-1]

        suffixArr[len(nums) - 1] = 1
        for i in range(len(nums) - 2, -1, -1):
            suffixArr[i] = suffixArr[i+1] * nums[i+1]

        for i in range(len(nums)):
            res.append(prefixArr[i] * suffixArr[i])

        return res
