class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        # make sure len of s1 <= len of s2
        if len(s1) > len(s2): return False

        freqList1 = [0] * 26
        for char in s1:
            freqList1[ord(char) - ord('a')] += 1


        l = 0
        r = len(s1) - 1
        freqList2 = [0] * 26
        for char in s2[:len(s1)]:
            freqList2[ord(char) - ord('a')] += 1

        while r < len(s2):
            if freqList1 != freqList2:
                left_char = s2[l]
                freqList2[ord(left_char) - ord('a')] -= 1
                l += 1
                r += 1
                if r >= len(s2): return False
                right_char = s2[r]
                freqList2[ord(right_char) - ord('a')] += 1
            else:
                return True

        return False







