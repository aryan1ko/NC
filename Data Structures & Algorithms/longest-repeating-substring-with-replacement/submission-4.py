class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        # k + maxfreq of char in window <= len of window
        count = {}

        left = 0
        max_freq = 0
        result = 0

        for right in range(len(s)):
            right_char = s[right]

            count[right_char] = count.get(right_char, 0) + 1
            max_freq = max(max_freq, count[right_char])

            while right - left + 1 - max_freq > k:
                left_char = s[left]
                count[left_char] -= 1
                left += 1

            result = max(result, right - left + 1)
            #AAABABB, k = 1
        return result

