class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        minHeap = []
        res = []

        for xi, yi in points:
            dist = (xi**2 + yi**2)
            heapq.heappush(minHeap, [-dist, xi, yi])

            if len(minHeap) > k:
                heapq.heappop(minHeap)

        while minHeap:
            dist, x1, y1 = heapq.heappop(minHeap)
            res.append([x1, y1])


        return res
