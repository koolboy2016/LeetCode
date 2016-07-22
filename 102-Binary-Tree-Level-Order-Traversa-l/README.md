# 102. Binary Tree Level Order Traversal

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

>For example:

Given binary tree [3,9,20,null,null,15,7],
    3
	
   / \
   
  9  20
  
    /  \
	
   15   7

return its level order traversal as:
[

  [3],
  
  [9,20],
  
  [15,7]
  
]

**使用广度优先遍历，设定一个指针，每次根据指针判断结点所在的层数，并对应输出**