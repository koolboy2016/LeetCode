题目是对[217-Contains-Duplicate](https://github.com/wanghao2020/LeetCode/tree/master/217-Contains-Duplicate),在原来查找重复数的基础上，对两者重复数目之间的距离必须要小于K

在原来题目的基础上，同样的使用HashMap的数据结构，每次将数组的下标存进Key对应的value中，每次判断是否重复元素，如果重复，且小于K，则返回为真，否则将新的元素的下标存入到value中，来替代原来的值。
