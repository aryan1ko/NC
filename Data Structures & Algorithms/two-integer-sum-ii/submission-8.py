class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l = 0
        
        def binarySearch(i, l, r, tar):
            while l <= r:
                m = (l + r) // 2
                if tar == numbers[m]:
                    return [i+1, m+1]
                elif tar > numbers[m]:
                    l = m + 1
                else:
                    r = m - 1
            return []


        for i in range(len(numbers)):

            temp = target - numbers[i]


            res = binarySearch(i, 1, len(numbers) - 1, temp)
            if res != []: return res


            # res = 0
            # if temp > numbers[i]:
            #     res = binarySearch(i+1, len(numbers) - 1, temp)
            # else:
            #     res = binarySearch(0, i-1, temp)
            # if res != -1:
            #     return [min(i+1, res+1), max(i+1, res+1)]

            



            
