# 172. Factorial Trailing Zeroes

Given an integer n, return the number of trailing zeroes in n!.

**Note**: Your solution should be in logarithmic time complexity.

> **就是统计n!中有多少个5的个数乘积，因此需要分别统计5,5^2,5^3...的个数，来统计阶乘中的5的乘积的个数**