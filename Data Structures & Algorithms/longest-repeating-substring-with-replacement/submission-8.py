class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        map = {}
        mostFreq = 0
        maxLen = 0
        left = 0

        for right in range(len(s)):
            right_char = s[right]
            map[right_char] = map.get(right_char, 0) + 1
            mostFreq = max(mostFreq, map[right_char])

            if right - left + 1 - mostFreq > k:
                left_char = s[left]
                map[left_char] -= 1
                left += 1
            
            maxLen = max(maxLen, right - left + 1)

        return maxLen