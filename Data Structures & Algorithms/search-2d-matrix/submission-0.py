class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        l = 0
        r = len(matrix[0]) - 1


        def binarySearch(target, r):
            if r < 0: return False

            l = 0
            r = len(matrix) - 1

            while l <= r:
                m = (l + r) // 2
                if target < matrix[r][m]:
                    r = m - 1
                elif target > matrix[r][m]:
                    l = m + 1
                else:
                    return True
            return False







        while l <= r:
            m = (l + r) // 2
            if target < matrix[0][m]:
                r = m - 1
            elif target > matrix[0][m]:
                l = m + 1
            else:
                return True
        if r < l:
            binarySearch(target, r)
        
        

        return binarySearch(target, r)
