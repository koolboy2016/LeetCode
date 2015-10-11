题目是对问题[217-Contains-Duplicate](https://github.com/wanghao2020/LeetCode/tree/master/217-Contains-Duplicate)和[219-Contains-Duplicate-II](https://github.com/wanghao2020/LeetCode/tree/master/219-Contains-Duplicate-II)的变化，只是不再是找出重复的数，而是在K个距离中找出差距不超过t的数字

解题思路：

1. 如果采用暴力的方法，依次遍历所用的时间一定是**O(n*n)**的复杂度，不能够满足要求，因为要采用二分查找法。以**K**的滑动区间为基准，每次在**K**的范围内进行搜索，判断所比较值是否在**t**的范围内。采用二叉树查找法能够保证查询的开销在**log(n)**范围内，这里面使用的是**Java**中的**TreeSet**包，依次遍历索要判断的数组。总的时间开销为**k*log(n)**。
2. 解题中注意的数组溢出的问题，如果测试变量为

```java
	    int[] nums = { -1, 2147483647 };
		int k = 1;
		int t = 2147483647;
```
就会出现数字溢出的问题，最后判断结果反而比要求值小。所以要变化成**java**中的**Long**类型
