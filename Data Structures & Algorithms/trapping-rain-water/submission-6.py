class Solution:
    def trap(self, height: List[int]) -> int:
        l, r = 0, len(height) - 1
        sum = 0
        maxLeft, maxRight = 0, 0

        while l < r:
            maxLeft = max(maxLeft, height[l])
            maxRight = max(maxRight, height[r])

            if maxleft < maxRight:
                l += 1
                if maxleft - height[l] > 0:
                    sum += maxLeft - height[l]
            else:
                r -= 1
                if maxRight - height[r] > 0:
                    sum += maxRight - height[r]
        
        return sum
            
            

        