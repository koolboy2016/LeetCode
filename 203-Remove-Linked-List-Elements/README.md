# 203. Remove Linked List Elements

Remove all elements from a linked list of integers that have value val.

Example

Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6

Return: 1 --> 2 --> 3 --> 4 --> 5


**删除节点操作**先删除head之后的等于val的结点，最后判断头结点是否相等即可。