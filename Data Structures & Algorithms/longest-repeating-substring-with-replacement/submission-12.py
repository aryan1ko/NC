class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        l = 0
        r = 0

        maxWindowLen = 0
        mostFreq = 0
        counts = {}

        while r < len(s):
            rightChar = s[r]
            counts[rightChar] = counts.get(rightChar, 0) + 1

            mostFreq = max(mostFreq, counts[rightChar])

            # check validity of current window
            if r - l + 1 - mostFreq > k:
                leftChar = s[l]
                counts[leftChar] -= 1
                l += 1
            
            maxWindowLen = max(maxWindowLen, r - l + 1)
            r += 1

        return maxWindowLen
