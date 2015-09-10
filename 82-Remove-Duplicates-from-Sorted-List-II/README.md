
# 1. Remove Duplicates from Sorted List II 


Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.

# 2. 删除排序链表中的重复数字 II

给定一个排序链表，删除所有重复的元素只留下原链表中没有重复的元素。

# 3. 编程注意事项

- 要新建一个头指针，来防止这个链表为空的情况
- 在循环条件判断中，要注意两者判断的先后顺序，因为**&&**符号为第一个判断条件不成立就不会执行第二个判断条件。如果调换了两者的先后顺序，将会出现空指针异常的情况。
