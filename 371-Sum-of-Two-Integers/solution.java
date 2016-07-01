public class Solution {
    public int getSum(int a, int b) {
        
        // 异或操作
        int newa = a ^ b ;
        // 计算进位
        int newb = (a & b) << 1 ;
        if (newb != 0 )
            return getSum(newa,newb);
        return newa ;
        
    }
}