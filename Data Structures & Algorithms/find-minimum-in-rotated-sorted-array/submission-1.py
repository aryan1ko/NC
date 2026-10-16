class Solution:
    def findMin(self, nums: List[int]) -> int:
        if nums[0] <  nums[len(nums)-1]:
                return nums[0]
        else:
                # search for pivot
                # either l & m > r or m & r < l
                # 450123
                # 345012
                              
                345612
                
                l = 0
                r = len(nums) - 1
                              
                while l<=r:
                        m = (l+r) // 2
                        
                        if nums[m] > nums[r]:
                                l = m+1    
                        elif nums[m] < nums[r]:
                                r = m  
                        else:
                                return nums[m]
                                
