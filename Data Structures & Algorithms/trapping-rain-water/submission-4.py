class Solution:
    def trap(self, height: List[int]) -> int:
        sum = 0

        l = 0
        r = len(height) - 1
        maxLeft = 0
        maxRight = 0

        while l < r:
            maxLeft = max(maxLeft, height[l])
            maxRight = max(maxRight, height[r])

            if maxLeft < maxRight:
                l += 1
                if maxLeft - height[l] > 0:
                    sum += maxLeft - height[l]
            else:
                r -= 1
                if maxRight - height[r] > 0:
                    sum += maxRight - height[r]

        return sum