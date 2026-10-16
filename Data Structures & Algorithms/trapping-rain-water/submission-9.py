class Solution:
    def trap(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        leftMax, rightMax = 0, 0
        sum = 0

        while l < r:
            leftMax = max(leftMax, height[l])
            rightMax = max(rightMax, height[r])

            if leftMax <= rightMax:
                l += 1
                if leftMax - height[l] > 0:
                    sum += leftMax - height[l]
            elif rightMax < leftMax:
                r -= 1
                if rightMax - height[r] > 0:
                    sum += rightMax - height[r]


        return sum

