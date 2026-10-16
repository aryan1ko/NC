class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        counted = {}

        for num in nums:
            if num in counted:
                return True
            counted[num] = 1
        
        return False