class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        # convert to hashset O(n)
        checkSet = set(nums)

        maxSeq = 0
        for num in nums:
            if num-1 not in checkSet:
                x=num
                while x in checkSet:
                    x+=1
                    maxSeq = max(maxSeq,x-num)
        
        return maxSeq