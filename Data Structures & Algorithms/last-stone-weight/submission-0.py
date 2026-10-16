class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones = [x * (-1) for x in stones]
        heapq.heapify(stones)

        while stones:
            x = heapq.heappop(stones)

            if stones:
                y = heapq.heappop(stones)
            else:
                return -(x)
            
            heapq.heappush(stones, (-y + x))
