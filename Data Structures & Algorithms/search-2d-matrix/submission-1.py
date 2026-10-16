class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        l = 0
        r = len(matrix[0]) - 1


        def binarySearch(target, row):
            if row < 0: return False
            if row > len(matrix[0]) - 1:
                row = len(matrix[0]) - 1

            l = 0
            r = len(matrix) - 1

            while l <= r:
                m = (l + r) // 2
                if target < matrix[row][m]:
                    r = m - 1
                elif target > matrix[row][m]:
                    l = m + 1
                else:
                    return True
            return False







        while l <= r:
            m = (l + r) // 2
            if target < matrix[m][0]:
                r = m - 1
            elif target > matrix[m][0]:
                l = m + 1
            else:
                return True
        if r < l:
            binarySearch(target, r)
        
        

        return binarySearch(target, r)
