class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        freqArr = [0] * 26

        for ch in s:
            freqArr[ord(ch) - ord('a')] += 1
        
        for ch in t:
            freqArr[ord(ch) - ord('a')] -= 1
            if freqArr[ord(ch) - ord('a')] < 0:
                return False
            
        return True