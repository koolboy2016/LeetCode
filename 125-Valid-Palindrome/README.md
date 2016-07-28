# 125. Valid Palindrome

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,

>"A man, a plan, a canal: Panama" is a palindrome.
>"race a car" is not a palindrome.

**Two pointers**，根据回文数的性质依次判断即可，每次碰到不是有效数字则做移动至有效数字，注意下标的范围。