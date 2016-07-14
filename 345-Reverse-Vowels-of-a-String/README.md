# 345. Reverse Vowels of a String

Write a function that takes a string as input and reverse only the vowels of a string.

>Example 1:

>Given s = "hello", return "holle".

>Example 2:

>Given s = "leetcode", return "leotcede".

**two pointers** 正常的翻转字符串的思想，使用两个头尾指针，当指向的元素都为元音字母的时候，互相交换。