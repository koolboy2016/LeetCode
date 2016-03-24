# 24. Swap Nodes in Pairs

### Given a linked list, swap every two adjacent nodes and return its head.


For example,
> **Given 1->2->3->4, you should return the list as 2->1->4->3.**

Your algorithm should use only constant space. You may **not modify** the values in the list, only nodes itself can be changed.

###　结题思路

   主要思路是采用选用每个Pair对前面的节点指针对后面的Pair进行变换即可，其余和链表交换的基本思路相同，最后返回原先头节点的后节点即可，很多链表题目中，自己加上一个空的头指针会方便很多。

 **{LinkedList}  |  {HeadNode}**
