class Solution:
    def specialArray(self, nums: List[int]) -> int:
        arr = [0] * (len(nums) + 1)
        numsOverN = 0
        for num in nums:
            if 0 <= num <= len(nums):
                arr[num] += 1
            else:
                numsOverN += 1

        for i in range(len(nums), 0, -1):
            numsOverN += arr[i]
            if i == numsOverN: return i

        return -1


