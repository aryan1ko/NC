class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        maxLen = 0
        left = 0
        freqMap = {}
        mostFreq = 0


        for right in range(len(s) - 1):
            right_char = s[right]
            freqMap[right_char] = freqMap.get(right_char, 0) + 1

            mostFreq = max(mostFreq, freqMap[right_char])

            if right - left + 1 - mostFreq > k:
                left_char = s[left]
                freqMap[left_char] -= 1
                left += 1

            maxLen = max(maxLen, right - left + 1)

        return maxLen