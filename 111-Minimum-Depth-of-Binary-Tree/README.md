# Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Hide Tags Tree : **Depth-first Search**,  **Breadth-first Search**

Hide Similar Problems:  **Binary Tree Level Order Traversal**,  **Maximum Depth of Binary Tree**

# 二叉树的最小深度

给定一个二叉树，找出其最小深度。

二叉树的最小深度为根节点到最近叶子节点的距离。

# 编程注意事项
- 方法的解决思路和求二叉树的最大深度方法很相似，都是使用 **递归** 的方法求左右二叉树的高度
- **注意** 的地方为：如果左右的某一个子树的 **高度为0** ，那么最短的到叶子节点的路径就应该是 **另一个子树的高度＋1**
