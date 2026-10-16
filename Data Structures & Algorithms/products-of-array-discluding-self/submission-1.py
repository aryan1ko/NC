class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prod = 1
        for i in range(0, len(nums)):
            prod = prod * nums[i]
        
        output = []
        for i in range(0, len(nums)):
            output.append(int(prod / nums[i]))

        return output