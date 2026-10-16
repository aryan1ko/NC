class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = {} # number -> freqency
        res = []

        for num in nums:
            map[num] = map.get(num, 0) + 1
        
        # freqArr = [] * (len(nums) + 1)
        freqArr = [[] for i in range(len(nums) + 1)]

        for key, freq in map.items():
            freqArr[freq].append(key)

        i = len(nums)
        while k > 0:
            if freqArr[i] == []:
                i -= 1
                continue
            k -= 1
            num = freqArr[i].pop()
            res.append(num)
        
        return res