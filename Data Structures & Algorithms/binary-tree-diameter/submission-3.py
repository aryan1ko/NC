# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        diameter = 0

        def height(node):
            if not node: return 0

            return 1 + max(height(node.left), height(node.right))

        diameter = max(diameter, height(root.left) + height(root.right))

        return diameter

        