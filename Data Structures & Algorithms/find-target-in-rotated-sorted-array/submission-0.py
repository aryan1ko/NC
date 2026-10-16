class Solution:
    def search(self, nums: List[int], target: int) -> int:
        # find pivot
        l = 0
        r = len(nums) - 1

        while l<=r:
            m = (l+r) // 2
            if nums[l] < nums[m]:
                # pivot is on right side
                l = m+1
            elif nums[m] < nums[r]:
                # pivot is on left
                r = m-1
            else:
                # we are on the correct segment
                break

        # set l and r
        if nums[l-1] < nums[l]:
            l += 1

        if l < len(nums) and target >= nums[l]:
            r = len(nums) - 1
        else:
            r = l - 1
            l = 0

        # binary search for target on selected segement
        while l<=r:
            m = (l+r) // 2
            if target < nums[m]:
                r = m-1
            elif target > nums[m]:
                l = m+1
            else:
                return m
        return -1