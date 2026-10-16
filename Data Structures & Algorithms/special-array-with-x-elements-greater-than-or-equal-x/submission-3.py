class Solution:
    def specialArray(self, nums: List[int]) -> int:
        n = len(nums)
        arr = [0] * (n+1)

        numsOverN = 0
        for num in nums:
            if 0 <= num <= n:
                arr[num] += 1
            else:
                numsOverN += 1
        
        for i in range(n, 0, -1):
            numsOverN += arr[i]

            if numsOverN == i: return i

        return -1

        