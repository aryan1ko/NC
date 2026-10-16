class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left = 0
        max_freq = 0
        count = {}
        result = 0

        for right in range(len(s)):
            right_char = s[right]
            count[right_char] = count.get(right_char, 0) + 1
            max_freq = max(max_freq, count[right_char])

            if right - left + 1 - max_freq > k:
                char_left = s[left]
                count[char_left] -= 1
                left += 1
                
            result = max(result, right - left + 1)
            
        return result
