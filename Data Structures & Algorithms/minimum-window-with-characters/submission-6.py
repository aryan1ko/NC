class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(s) < len(t): return ""

        tCounts = {}
        sCounts = {}
        shortLen = float("inf")
        res = ""

        for ch in t:
            tCounts[ch] = tCounts.get(ch, 0) + 1

        l = 0
        r = 0

        sCounts[s[0]] = 1

        while r < len(s):
            tmp = 0
            for key in tCounts:
                if key in sCounts and sCounts[key] >= tCounts[key]:
                    tmp = 0
                else:
                    tmp = 1
                    break

            if tmp == 0:
                if r - l + 1 < shortLen:
                    shortLen = r - l + 1
                    res = s[l:r+1]
                sCounts[s[l]] -= 1
                l += 1
            else:
                r += 1
                if r >= len(s): break
                sCounts[s[r]] = sCounts.get(s[r], 0) + 1
            
        return res


