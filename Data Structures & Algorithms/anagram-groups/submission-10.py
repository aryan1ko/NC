class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        # load all strs in map
        for str in strs:
            freqArr = [0] * 26
            for ch in str:
                freqArr[ord(ch) - ord('a')] += 1
            
            key = tuple(freqArr)
            if key not in map:
                map[key] = []
            map[key].append(str)

        res = []
        for k,v in map.items():
            res.append(v)

        return res