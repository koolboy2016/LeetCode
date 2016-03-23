#  20. Valid Parentheses

Given a string containing just the characters**'(', ')', '{', '}', '[' and ']'**, determine if the input string is valid.

The brackets must close in the correct order, *"()" and "()[]{}"* are all valid but* "(]"* and *"([)]"* are not.

Subscribe to see which companies asked this question

## 解题思路： 使用栈

每次只有右边的括号才能进行匹配消除，左边括号只需加入栈即可，最后判断栈是否为空即可


### 函数说明

*public boolean isVaild(String s)* 原先思路

*solutions(String s)* 整理后的代码 
