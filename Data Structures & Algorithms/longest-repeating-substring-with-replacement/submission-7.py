class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left = 0
        maxLen = 0
        count = {}
        max_freq = 0


        for right in range(len(s)):
            right_char = s[right]
            count[right_char] = count.get(right_char, 0) + 1
            max_freq = max(max_freq, count[right_char])

            if right - left + 1 - max_freq > k:
                left_char = s[left]
                count[left_char] -= 1
                left += 1
            else:
                maxLen = right - left + 1

        return maxLen

            
            