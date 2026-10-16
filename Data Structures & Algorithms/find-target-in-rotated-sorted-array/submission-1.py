class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l = 0
        r = len(nums) - 1
        while l<=r:
            m = (l+r) // 2

            if nums[m] < nums[r]:
                r = m
            elif nums[m] > nums[r]:
                l = m+1
            else:
                break
# 3 5 6 0 1 2


        r = len(nums) - 1
        if target > nums[r]:
            r = l-1
            l = 0


        # binary search on that side
        while l<=r:
            m = (l + r) // 2
            if target > nums[m]:
                l = m+1
            elif target < nums[m]:
                r = m-1
            else:
                return m

        return -1

        