# Search in Rotated Sorted Array

Suppose a sorted array is rotated at some pivot unknown to you beforehand.(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
You are given a target value to search. If found in the array return its index, otherwise return -1.
You may assume no duplicate exists in the array.

**Tag: Array Binary Search**

# 搜索旋转排序数组

假设有一个排序的按未知的旋转轴旋转的数组(比如，0 1 2 4 5 6 7 可能成为4 5 6 7 0 1 2)。给定一个目标值进行搜索，如果在数组中找到目标值返回数组中的索引位置，否则返回-1。
你可以假设数组中不存在重复的元素。

# 编程注意事项

- 如果按照遍历搜索，算法的时间性能肯定达不到要求。c++的运行速度本体为4ms出结果
- 采用二分法查找元素，难点为注意边界的划分。
- 注意数组中最小数和二分法*Mid*的关系，先根据*Mid*和数组最小数的关系划分左右两种情况。
- 如果最小点在中间点左边，则根据target的值判断是否在右边的范围来确定新的begin和end的值
- 如果最小点在中间点右边，则根据target的值判断是否在左边的范围来确定新的begin和end的值
- 说的抽象，感兴趣的可以在纸上画图，比较清除


