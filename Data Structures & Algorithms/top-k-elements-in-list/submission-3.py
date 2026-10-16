class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = {}
        freqArr = [[] for i in range(len(nums) + 1)]
        result = []

        for num in nums:
            map[num] = map.get(num, 0) + 1

        for n,c in map.items():
            freqArr[c].append(n)
        
        for i in range(len(nums), 0, -1):
            if k <= 0:
                break
            if freqArr[i] != []:
                for j in range(0, len(freqArr[i])):
                    result.append(freqArr[i][j])
                    k -= 1

        return result
