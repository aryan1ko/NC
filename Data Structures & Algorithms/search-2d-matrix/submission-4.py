class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = 0
        def colBinarySearch():
            l = 0
            r = len(matrix) - 1

            while l <= r:
                m = l + r >> 1

                if target < matrix[m][0]:
                    r = m - 1
                elif target > matrix[m][0]:
                    l = m + 1
                else:
                    return True
            
            if r < 0: return False
            if l == len(matrix):
                row = len(matrix) - 1
            else:
                row = l
        
        left = 0
        right = len(matrix) - 1

        while left <= right:
            middle = left + right >> 1

            if target < matrix[row][middle]:
                right = middle - 1
            elif target > matrix[row][middle]:
                left = middle + 1
            else:
                return True
        return False

                

