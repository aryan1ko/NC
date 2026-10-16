class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left = 0
        freqMap = {}
        maxLen = 0
        maxChar = 0



        for right in range(len(s)):
            right_char = s[right]
            freqMap[right_char] = freqMap.get(right_char, 0) + 1
            maxChar = max(maxChar, freqMap[right_char])

            if right - left + 1 - maxChar > k:
                left_char = s[left]
                freqMap[left_char] -= 1
                left += 1
            maxLen = max(maxLen, right - left + 1)

        return maxLen
