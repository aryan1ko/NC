class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numSet = set(nums)
        maxSeq = 0

        for num in nums:
            if num-1 not in numSet:
                x = num
                while x in numSet:
                    maxSeq = max(maxSeq,x-num + 1) 
                    x+=1
        
        return maxSeq
                