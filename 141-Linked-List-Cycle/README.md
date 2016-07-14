# Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

**Two pointers**使用两个指针，如果无环，最后肯定指针能为空。如果有环，使两个指针的移动速度不同，最终慢指针都会遇到快指针，相遇则判定有环存在、