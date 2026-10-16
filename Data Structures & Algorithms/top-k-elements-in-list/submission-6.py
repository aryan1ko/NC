class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = {} # number -> freqency
        res = []

        for num in nums:
            map[num] = map.get(num, 0) + 1

        freqArr = [[] for i in range(len(nums) + 1)]

        for key, freq in map.items():
            freqArr[freq].append(key)

        for i in range(len(freqArr) - 1, -1, -1):
            for num in freqArr[i]:
                res.append(num)
                if len(res) == k: return res
