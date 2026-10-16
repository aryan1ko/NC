class Solution:
    def trap(self, height: List[int]) -> int:
        leftHeight = height[0]
        rightHeight = height[len(height) - 1]
        l, r = 0, len(height) - 1

        while l < r:
            minHeight = min(leftHeight, rightheight)
        