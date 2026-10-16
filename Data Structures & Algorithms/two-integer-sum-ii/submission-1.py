class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0
        right = len(numbers) - 1
        sum = 0

        while sum != target:
            if sum > target:
                right -= 1
            elif sum < target:
                left += 1
            sum = numbers[left] + numbers[right]


        return [min(1 + left, 1 + right), max(1 + left, 1 + right)]