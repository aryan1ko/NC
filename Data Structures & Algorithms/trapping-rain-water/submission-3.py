class Solution:
    def trap(self, height: List[int]) -> int:
        sum = 0
        l = 0
        r = len(height) - 1

        leftMax, rightMax = height[l], height[r]


        while l < r:
            if leftMax < rightMax:
                l += 1
                leftMax = max(leftMax, height[l])
                if leftMax - height[l] > 0:
                    sum += leftMax - height[l]
            else:
                r -= 1
                rightMax = max(rightMax, height[r])
                if rightMax - height[r] > 0:
                    sum += rightMax - height[r]
        
        return sum







        return sum