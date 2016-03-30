# 29. Divide Two Integers

Divide two integers without using multiplication, division and mod operator.

If it is overflow, return MAX_INT.

Subscribe to see which companies asked this question

## 注意问题

1. 要注意数的越界问题
2  要注意数的正负性问题
3. 知道任何一个整数可以表示成以2的幂为底的一组基的线性组合，即num=a_0*2^0+a_1*2^1+a_2*2^2+...+a_n*2^n。基于以上这个公式以及左移一位相当于乘以2，我们先让除数左移直到大于被除数之前得到一个最大的基。然后接下来我们每次尝试减去这个基，如果可以则结果增加加2^k,然后基继续右移迭代，直到基为0为止。因为这个方法的迭代次数是按2的幂直到超过结果，所以时间复杂度为O(logn)。

### 参考博客[http://blog.csdn.net/linhuanmars/article/details/20024907?utm_source=tuicool&utm_medium=referral]