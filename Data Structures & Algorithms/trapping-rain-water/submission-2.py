class Solution:
    def trap(self, height: List[int]) -> int:
        maxLeft = [0] * len(height)
        maxRight = [0] * len(height)
        res = [0] * len(height)

        maxLeft[0] = 0
        for i in range(1, len(height)):
            maxLeft[i] = max(height[i-1], maxLeft[i-1])


        maxRight[len(height) - 1] = 0
        for i in range(len(height) - 2, 0, -1):
            maxRight[i] = max(height[i+1], maxRight[i+1])

        for i in range(len(res)):
            diff = min(maxLeft[i], maxRight[i]) - height[i]
            if diff > 0:
                res[i] = diff
        
        sum = 0
        for num in res:
            sum += num
        
        return sum